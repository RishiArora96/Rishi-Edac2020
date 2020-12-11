
use db2;
create table Publishers(Pid int PRIMARY KEY,
						Pname varchar(30),
                        Email varchar(50) unique,
                        PhoneNo varchar(20));
insert into Publishers values(1,'WILEY','WDT@vsnl.net',91-11-23242666);
insert into Publishers values(2,'McGRAW-HILL','feedback@mheducation.com',91-11-00244442);
insert into Publishers values(3,'TECHMEDIA','books@techmedia.com', 91-11-21000456);
insert into Publishers values(4,'WROX','info@wrox.com',91-11-34666662);
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

create table Subject(Subid int PRIMARY KEY,
					 SubName varchar(30));
alter table Subject modify Subid varchar(5);
desc Subject;
insert into Subject values('ORA','Oracle Database');
insert into Subject values('JAVA','Java Language');
insert into Subject values('JEE','Java Enterprise Edition');
insert into Subject values('VB','Visual Basic.net');
insert into Subject values('ASP','ASP.net');
select * from Subject;

create table Title(Title_ID int PRIMARY KEY,
				   Title varchar(30),
                   Pub_Date date);
alter table Title add Price int(10);
alter table Title add Pid int;
alter table Title add constraint Pid_fk foreign key (Pid) references Publishers(Pid); 
select Title_ID, Title, Pid, Pub_Date, price from Title;
desc Title;              
insert into Title values(1001,'ASP.net unleashed','2005-04-02',540,1);
insert into Title values(1002,'Oracle Complete Ref.','2005-05-01',575,3);
insert into Title values(1003,'Mastering EJB','2005-02-03',475,2);
insert into Title values(1004,'JAVA Complete Ref.','2005-03-04',499,1);
insert into Title values(1005,'Pro.VB.net','2005-06-04',450,4);
select * from Title;

create table TitleAuthors( Auid int,
					 Title_ID int,
                     Importance Numeric(10),
                     constraint TitleAuthors_Auid_fk foreign key (Auid) references Authors (Auid),
                     constraint Title_id_fk foreign key (Title_ID) references Title (Title_ID)); 
desc TitleAuthors;
insert into TitleAuthors values(104,1001,1);
insert into TitleAuthors values(105,1002,1);
insert into TitleAuthors values(106,1003,1);
insert into TitleAuthors values(101,1004,1);
insert into TitleAuthors values(103,1005,1);
insert into TitleAuthors values(102,1005,2);
select * from TitleAuthors;

select SubName from Subject where SubName = 'Oracle Database';
select SubName from Subject where subname like 'J%'; 
select SubName from Subject where SubName like '%.net%';
select AName from Authors where AName like '%er';
select Pname from Publishers where Pname like '%hill%';

select Title from Title where Price < 500;
select Title from Title where Pub_Date = '2005-03-04';
select SubName from subject where Subid = 'JAVA' OR Subid ='JEE';
select AName from Authors where Auid > 103;
select * from Title where Title_id = 1001 OR Price > 400; 

select * from Publishers where Pname = 'TECHMEDIA' OR Pname ='WROX';

select avg(importance) from TitleAuthors;
select max(price) from Title;
select sum(price) from Title;

create table Employee(empid int,
					   Emp_Name varchar(30));
insert into Employee values(1,'Roshani Deoghare');
insert into Employee values(2,'Rupali Kale');
insert into Employee values(3,'Rushikesh Joshi');
insert into Employee values(4,'Rushabh Bhoyar');
desc Employee;
select * from Employee;
alter table Employee add primary key (empid);
alter table Employee add dept_id int NOT NULL;
alter table Employee modify Emp_Name varchar(30);
update Employee set Emp_Name = 'Radhika Joshi' where empid = 4;
update Employee set Emp_Name = 'Rudrani Ajanakar' where empid = 3;
truncate table employee;

create table Employee1(Empid int Not NULL UNIQUE,
					   Emp_Name varchar(30),
                       Salary float(7,3));
insert into Employee1 values(101,'Riya',1234.57);
insert into Employee1 values(102,'Monika',1530.23);
insert into Employee1 values(103,'Amol',1652.76);
insert into Employee1 values(104,'Bhushan',1775.15);
desc Employee1;
select * from Employee1;

select round(1234.567,2) as Employee1;
select round(1530.019,2) as Employee1;

select ceil(1530.019) as Employee1;
select ceil(1775.156) as Employee1;

select ceiling(1652.786) as Employee1;
Select ceiling(1234.567) as Employee1;

select floor(1530.019) as Employee1;
select floor(1652.786) as Employee1;

select sign(-15);
select sign(240);

select mod( 17,5);
select 23 mod 7;
select 15 % 4;

select sqrt(256);
select sqrt(64);

select power(12,2);
select power(23,2);

select truncate(1234.576,2);
select truncate(1557.123,1);

select character_length("CDAC Kharghar") as LengthOfString;
select concat("CDAC Kharghar") as ConcatenatedString;
select concat_ws("-", "Welcome", "to", "CDAC","Mumbai");
select reverse("Hello Friends");

select curdate();
select current_date();
select current_time();
select current_timestamp();
select curtime();
