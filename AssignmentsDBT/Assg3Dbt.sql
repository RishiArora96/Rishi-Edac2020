use db2;
create table Department(dept_id int ,
						dept_name varchar(20),
                        constraint pk_department PRIMARY KEY (dept_id));
select * from department;
insert into department values (1,'Finance'); 
insert into department values (2,'Training');
insert into department values (3,'Marketing');
select * from department;
desc department;
create table Employee( empid int NOT NULL,
					   emp_name varchar(50),
                       dept_id int ,
                       salary int NOT NULL,
                       manager int,
					   foreign key (dept_id) references department (dept_id));
select * from employee;
desc employee;
insert into Employee values(1,'Arun',1,8000,4);
insert into Employee values(2,'Kiran',1,7000,1);
insert into Employee values(3,'Scott',1,3000,1);
insert into Employee values(4,'Max',2,9000,null);
insert into Employee values(5,'Jack',2,8000,4);
insert into Employee Values(6,'king',null,6000,1);
select * from employee;

create table Publishers(Pid int PRIMARY KEY,
						Pname varchar(30),
                        Email varchar(50) unique,
                        PhoneNo varchar(20));
insert into Publishers values(1,'WILEY','WDT@vsnl.net',9123242666);
insert into Publishers values(2,'McGRAW-HILL','feedback@mheducation.com',9400244442);
insert into Publishers values(3,'TECHMEDIA','books@techmedia.com', 9721000456);
insert into Publishers values(4,'WROX','info@wrox.com',9634666662);
select * from Publishers;
desc publishers;

create table Authors(Auid int PRIMARY KEY,
					 AName varchar(30),
                     PhoneNo numeric(20),
                     Email varchar(30));
insert into Authors values(101,'Daniel Bell',null,'danielbell@yahoo.com');
insert into Authors values(102,'James Goodwill',null,'goodwill12@hotmail.com');
insert into Authors values(103,'Stephen Walter',null,'stephen@hotmail.com');
insert into Authors values(104,'Davaid Hunter',null,'hunter@gmail.com');
insert into Authors values(105,'Kevin Loney',null,'kevin@oracle.com');
insert into Authors values(106,'ED. Romans',null,'roman@gmail.com');
select * from Authors;

select * from Authors order by AName;
select * from Publishers order by Pname DESC;
select * from Employee order by emp_name;

select sum(salary) from Employee group by dept_id;
select * ,sum(salary) from Employee group by dept_id;
select sum(salary) from Employee where salary > 7000 ;
select dept_id, sum(salary) from Employee where salary > 17000 group by dept_id;

select dept_id, sum(salary) from Employee group by dept_id having sum(salary) > 17000;
select dept_id, sum(salary) from Employee group by dept_id having sum(salary) > 18000;
select dept_id, sum(salary) from Employee group by dept_id having sum(salary) < 20000;
select dept_id,emp_name, sum(salary) from Employee group by emp_name having sum(salary) > 7000;
