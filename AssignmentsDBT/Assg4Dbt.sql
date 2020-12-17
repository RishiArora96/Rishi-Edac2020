create database Assignment4;
use Assignment4;

CREATE TABLE EMP1(EMP_NO INTEGER NOT NULL,EMP_NAME CHAR(30));
CREATE TABLE EMP2(EMP_NO INTEGER NOT NULL,EMP_NAME CHAR(30));

INSERT INTO EMP1 VALUES(1,'A');
INSERT INTO EMP1 VALUES(2,'B');
INSERT INTO EMP1 VALUES(3,'C');

INSERT INTO EMP2 VALUES(1,'A');
INSERT INTO EMP2 VALUES(2,'B');
INSERT INTO EMP2 VALUES(4,'D');
INSERT INTO EMP2 VALUES(5,'E');

SELECT EMP_NO,EMP_NAME FROM EMP1
UNION
SELECT EMP_NO,EMP_NAME FROM EMP2;



CREATE TABLE department1(
id integer,
dept_no integer,
dept_name varchar(50),
CONSTRAINT dept1_pk PRIMARY KEY(id)
);

ALTER TABLE department1 ADD DEPT_ID INTEGER;
DELETE DEPT_ID FROM department1;
CREATE TABLE employee23(
  id         integer,
  emp_name   varchar(100),
  dept_id    integer,
  CONSTRAINT emp1_pk PRIMARY KEY (id),
  CONSTRAINT emp1_dept1_fk FOREIGN KEY (dept_id) REFERENCES department1(id)
);

INSERT INTO department1 values(1,10,'finance');
INSERT INTO department1 values(2,11,'training');
INSERT INTO department1 values(3,12,'marketing');
alter table employee23 add salary integer;

alter table employee23 add designation char(20);
truncate table  employee;

desc employee23;

INSERT INTO employee23 values(1,'Arun',1,6000,'manager');
INSERT INTO employee23 values(2,'kiran',1,86000,'manager');
INSERT INTO employee23 values(3,'scott',1,7000,'developer');

INSERT INTO employee23 values(4,'max',2,8000,'tester');
INSERT INTO employee23 values(5,'king',2,90000,'DBA');

SELECT department1.DEPT_NAME,employee23.EMP_NAME FROM employee23 INNER JOIN  department1 ON department1.id=employee23.dept_id;

Select employee23.emp_name, department1.dept_name from employee23 inner join department1 on department1.id=employee23.dept_id;



Select employee23.* , department1.* from employee23 INNER JOIN department1 on department1.id=employee23.dept_id;


Select department1.id, employee23.dept_id ,sum(salary) from employee23 INNER JOIN department1 on department1.id=employee23.dept_id;

select department1.dept_name,employee23.emp_name from employee23 right join  department1  on department1.id=employee23.dept_id;

alter table employee23 add manager varchar(20);
desc employee23;
insert into employee23 values(7,'rohan',2,56000,'tester','sohan');
insert into employee23 values(8,'roshani',2,46000,'developer','ruchit');
insert into employee23 values(9,'rohit',3,86000,'tester','rushabh');
insert into employee23 values(10,'rohitk',2,96000,'developer','ruchit');

Select distinct e.emp_name,m.manager from employee23 e inner join employee23 m on e.manager=m.manager;

select distinct e.emp_name, d.dept_name from employee23 e inner join department1 d on e.dept_id=d.id;


/*Select emp_name from employee23 where emp_name NOT IN(select emp_name from employee23 where emp_name='Arun' or salary!=8000 );*/


Select emp_name from employee23 where dept_id In(select dept_id from employee23 where emp_name='jack') Limit 1;

Select emp_name from employee23 where salary IN(select min(salary) from employee23);
Update employee23 set salary=15000 where dept_id IN (select dept_id from ( select dept_id from employee23  where emp_name='max'order by dept_id  DESC)as temptable);


