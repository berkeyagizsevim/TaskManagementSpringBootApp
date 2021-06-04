create table user(id identity primary key, fullName varchar(50), email varchar(50), password varchar(50), phoneNumber varchar(50), dateOfBirth date);

create table task(id identity primary key, taskTitle varchar(50), taskDescription varchar(50), taskStatus varchar(50));
					
create table assignedTasks(uid bigint, 
				       tid bigint,
				       foreign key(uid) references user(id),
				       foreign key(tid) references task(id));