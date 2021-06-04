package sen3004.taskmanagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import sen3004.taskmanagement.model.User;
import sen3004.taskmanagement.service.IUser;

@Repository
public class TaskManagementRepository implements IUser {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private RowMapper<User> rowMapper = new RowMapper<User>() {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setFullName(rs.getString("fullName"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setPhoneNumber(rs.getString("phoneNumber"));
			user.setDateOfBirth(rs.getObject("dateOfBirth", LocalDate.class));
			return user;
		}
	};


	@Override
	public List<User> findAll() {
		String sql = "select * from user";
		return jdbcTemplate.query(sql, rowMapper);
	}


	@Override
	public User findById(int id) {
		String sql = "select * from user where id = ?";
		return DataAccessUtils.singleResult(jdbcTemplate.query(sql, rowMapper, id));
	}


	@Override
	public void create(User user) {
		String sql = "insert into user(fullName, email, password, phoneNumber, dateOfBirth) values (?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getFullName(), user.getEmail(), user.getPassword(), user.getPhoneNumber(), user.getDateOfBirth());
	}


	@Override
	public void delete(int id) {
		String sql = "delete from user where id = ?";
		jdbcTemplate.update(sql,id);
		
	}
	
	
}
