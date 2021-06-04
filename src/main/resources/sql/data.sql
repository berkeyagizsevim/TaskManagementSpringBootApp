INSERT INTO user(id, fullName, email, password, phoneNumber, dateOfBirth) values (1,'Berke Yağız Sevim', 'berkeyagizsevim@gmail.com', '123123123', '05372056935',parsedatetime('06-11-1991', 'dd-MM-yyyy'));
INSERT INTO user(id, fullName, email, password, phoneNumber, dateOfBirth) values (2,'Berke', 'berkeyagizsevim@gmail.com', '123123123', '05372056935',parsedatetime('06-06-1993', 'dd-MM-yyyy'));
INSERT INTO user(id, fullName, email, password, phoneNumber, dateOfBirth) values (3,'Yağız ', 'berkeyagizsevim@gmail.com', '123123123', '05372056935',parsedatetime('06-01-1999', 'dd-MM-yyyy'));
INSERT INTO user(id, fullName, email, password, phoneNumber, dateOfBirth) values (4,'Harun ', 'berkeyagizsevim@gmail.com', '123123123', '05372056935',parsedatetime('06-01-1999', 'dd-MM-yyyy'));
INSERT INTO user(id, fullName, email, password, phoneNumber, dateOfBirth) values (5,'Beril ', 'berkeyagizsevim@gmail.com', '123123123', '05372056935',parsedatetime('06-01-1999', 'dd-MM-yyyy'));




insert into task(id, taskTitle, taskDescription, taskStatus ) values(1, 'First Task','1', 'todo');
insert into task(id, taskTitle, taskDescription, taskStatus ) values(2, 'Second Task','2', 'doing');
insert into task(id, taskTitle, taskDescription, taskStatus ) values(3, 'Third Task','3', 'done');
insert into task(id, taskTitle, taskDescription, taskStatus ) values(4, 'Forth Task','4', 'done');
insert into task(id, taskTitle, taskDescription, taskStatus ) values(5, 'Fifth Task','5', 'todo');
insert into task(id, taskTitle, taskDescription, taskStatus ) values(6, 'Sixth Task','6', 'doing');

insert into assignedTasks(uid, tid) values (1,1);
insert into assignedTasks(uid, tid) values (1,2);
insert into assignedTasks(uid, tid) values (2,1);
insert into assignedTasks(uid, tid) values (3,3);
insert into assignedTasks(uid, tid) values (4,4);
insert into assignedTasks(uid, tid) values (5,5);



