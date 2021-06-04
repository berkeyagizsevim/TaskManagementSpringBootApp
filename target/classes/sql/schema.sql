create table user(id identity primary key, fullname varchar(50), email varchar(50), password varchar(50), phonenumber varchar(50), dateofbirth date);

create table task(id identity primary key, tasktitle varchar(50), taskdescription varchar(50), taskstatus varchar(50));
					
create table assignedTasks(uid bigint, 
				       tid bigint,
				       foreign key(uid) references user(id),
				       foreign key(tid) references task(id));