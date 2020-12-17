create database db3;
use db3;
select database() ;
show databases ;
Create table EMP ( EMPNO numeric(4) not null, ENAME varchar(30) not null, JOB varchar(10), MGR numeric(4), HIREDATE date, SAL numeric(7,2), DEPTNO numeric(2) ); 
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1006,  'Pooja',  'MANAGER'  ,     null    , '2000-02-18' ,6000, 10 );


Create table dept (dno numeric(4) not null, dname varchar(10) not null,area varchar(30));
Insert into dept(dno,dname,area) values(10,'Store','Mumbai');
Insert into dept(dno,dname,area) values(20,'Purchase','Mumbai');
Insert into dept(dno,dname,area) values(30,'Store', 'Delhi');
Insert into dept(dno,dname,area) values(40,'Marketing','Pune');
Insert into dept(dno,dname,area) values(50,'Finance','Delhi');
Insert into dept(dno,dname,area) values(60,'Accounts','Mumbai');

SELECT * FROM EMP ;


/* 	1.	Write a Procedure that accepts values of two non-zero numbers using IN parameter and perform addition, subtraction, multiplication, division and print. */
DROP procedure CALCULATE_DATA  ; 
DELIMITER $$

CREATE PROCEDURE CALCULATE_DATA(IN NUM1 int,IN NUM2 int)
BEGIN
 declare SUM1 ,DIFF, PRODUCT,DIVISION INT ;

 SET SUM1 = NUM1 + NUM2 ;
 SET DIFF = NUM1 - NUM2 ;
 SET PRODUCT = NUM1 * NUM2 ;
 SET DIVISION = NUM1 / NUM2 ;
 
 SELECT SUM1,DIFF,PRODUCT,DIVISION ;
 
 END $$ 
 
 CALL CALCULATE_DATA(12,115) ;

/* 2.	Write a Procedure to print the string in REVERSE order. Take the input using IN parameter. (Ex .Database , o/p :esabatad) */
DROP procedure REVERSE_STRING  ; 
DELIMITER &&
CREATE PROCEDURE REVERSE_STRING()
BEGIN
 declare REVERSEORDER VARCHAR(20);
DECLARE STR_NAME varchar(50) ;
SET STR_NAME = "RUSHAB" ;
SELECT REVERSE(STR_NAME) ;
 

 
 END &&
 
 CALL REVERSE_STRING() ;

DROP procedure REVERSE_STRINGIN  ; 
DELIMITER &&

CREATE PROCEDURE REVERSE_STRINGIN(INOUT STR_NAME varchar(50))
BEGIN

DECLARE S_NAME VARCHAR(50);

SELECT REVERSE(STR_NAME) 
INTO STR_NAME ;

 END &&
 
 SET @X = "PROMETHEUS" ;
 CALL REVERSE_STRINGIN(@X) ;
 SELECT @X ;

/*3.	Write a Procedure to display top 5 employee based on highest salary and display employee number, employee name and salary. */


DROP PROCEDURE DISPLAY_TOPEMP ;

DELIMITER && 
CREATE PROCEDURE DISPLAY_TOPEMP()
BEGIN 

SELECT EMPNO ,ENAME,SAL FROM EMP ;

END &&

CALL  DISPLAY_TOPEMP() ;

/* 4.	Write a Procedure to create table emp_test with e_id integer, e_name varchar(10), e_joining_date date as columns */

DROP PROCEDURE TABLE_EMP ;

DELIMITER !!
CREATE PROCEDURE TABLE_EMP()
BEGIN 

create TABLE emp_test(e_id integer, e_name varchar(10), e_joining_date date) ;
DESC emp_test ;

END !!

CALL  TABLE_EMP() ;

DELIMITER |
CREATE PROCEDURE SP_CREATE_TABLE_TEST ()
   BEGIN
      CREATE TABLE TEST 
      (
        TestID int(11) default NULL,
        TestName varchar(100) default NULL
      ) 
      ENGINE=InnoDB DEFAULT CHARSET=utf8;
   END;

|
DROP PROCEDURE TABLE_EMP_RUSHIG ;


/*5.	Write a Procedure to add a department row in the DEPT table with the following values for columns 
			deptno  vaue 60,Dname  value should be  ‘Education’, area value should be Pune. */
drop PROCEDURE TABLE_DEPT;
use db3;
DELIMITER !!
CREATE PROCEDURE TABLE_DEPT()
BEGIN
Insert into dept value(60,'Education','Pune');
select * from dept ;
END;
!!
 Call TABLE_DEPT();
 
 
 /* 6.	Write a program that declares an integer variable called num, assigns a value to it and print, the value of the variable itself, its square, and its cube. */
 
 DROP PROCEDURE SQUARE_CUBE ;
 DELIMITER //
CREATE PROCEDURE SQUARE_CUBE(IN NUM1 int)
BEGIN
 declare SQUARE,CUBES INTEGER ;

SET SQUARE = NUM1 * NUM1 ;
SET CUBES = NUM1 * NUM1 * NUM1 ;
 
 SELECT NUM1, SQUARE,CUBES ;
 
 END //
 
 CALL SQUARE_CUBE(25) ;



/* 7.	Write a program that declares an integer variable assign a value to it and display it using OUT parameter */
DROP PROCEDURE DECLARES_INTEGER ;
 DELIMITER //
/* CREATE PROCEDURE DECLARES_INTEGER(OUT NUM1 int)
BEGIN
DECLARE NUM INT ;
SET NUM = 12 ; 
SELECT NUM INTO NUM1 ; 
 END //
 
SET @NUM1 = 12 ; 
 CALL DECLARES_INTEGER(@NUM1) ;
 SELECT @NUM1 ; */

DROP PROCEDURE DECLARE_VALUE ;
DELIMITER &&

CREATE PROCEDURE DECLARE_VALUE(OUT NUM INTEGER)
BEGIN

SELECT  @NUM ;

 END &&
 
 SET @NUM = 35 ;
 CALL DECLARE_VALUE(@NUM) ;

 
 
 
/* CREATE PROCEDURE my_sqrt(input_number INT, OUT out_number FLOAT)
BEGIN
    SET out_number=SQRT(input_number);
END$$ */


/* 8.	Write a program that demonstrates the usage of IN and OUT parameters. */
drop PROCEDURE my_sqrt ;
delimiter &&
CREATE PROCEDURE my_sqrt(IN input_number INT, OUT out_number float)
BEGIN
	
    SET out_number=SQRT(input_number);
    
END &&

call my_sqrt(15,@out_number) ;
/*call my_sqrt(64,@out_number) ; */
SELECT @out_number ;