create database booklib;
use booklib;
create table Member(Member_id int, 
					Member_name varchar(20),
					Member_address varchar(50),
                    Acc_Open_Date date, 
                    Membership_type varchar(20),
                    Penalty_Amt int);
select *from member;
create table Books(Book_No int,
				   Book_Name varchar(30),
                   Author_name varchar(30),
                   Cost double, 
                   Category char(10));
select * from books;
create table Issue(Lib_Issue_Id int,
				   Book_No int,
                   Member_id int,
                   Issue_Date date,
                   Return_Date date);
select * from Issue;                 
alter table  Member drop Penalty_Amt;
insert into Member values(1,'Richa Sharma','Pune','2010/12/05','Lifetime');
insert into Member values(2,'Garima Sen','Pune','2010/07/04','Annual');
insert into Member values(3,'Rohan Kumar','Delhi','2011/12/23','Annual');
insert into Member values(4,'Mohit Kumar','Mumbai','2012/1/02','Lifetime');
insert into Member values(5,'Sohan Kumar','Banglore','2009/04/14','Annual');
select Member_id,Member_name,Member_address,date_format(Acc_Open_Date,"%d-%b-%Y") as Acc_Open_Date, Membership_type from member;
desc member;
select * from member;
use booklib;
insert into Books values(101,'Lets us C','Denis Ritchie',450,'System');
insert into Books values(102,'Oracle - Complete Reference', 'Loni',550,'Database');
insert into Books values(103,'Mastering SQL', 'Loni',250,'Database');
insert into Books values(104,'PL-SQL-Ref', 'Scott Urman',750,'Database');
select *from books;
update Books set cost = 300, category = 'RDBMS' where Book_No= 103;
set sql_safe_updates = 0;
drop table issue;
show tables;
create table Issue(Lib_Issue_Id int,
				   Book_No int,
                   Member_id int,
                   Issue_Date date,
                   Return_Date date);
select * from issue;
insert into Issue values(7001,101,1,'2006/12/10',null);
insert into Issue values(7002,102,2,'2006/12/25',null);
insert into Issue values(7003,104,1,'2006/01/15',null);
insert into Issue values(7004,101,1,'2006/07/04',null);
insert into Issue values(7005,104,2,'2006/11/15',null);
insert into Issue values(7006,101,3,'2006/02/08',null);
select Lib_Issue_Id,Book_No,Member_id,date_format(Issue_Date,"%d-%b-%Y") as Issue_Date, Return_Date from Issue;
select * from issue;

