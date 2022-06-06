create database Yogii;
use Yogii;
create database my;
use my;
create table EMPLOYEE
(
EMPLOYEE_ID INT (6),
LAST_NAME VARCHAR (25),
JOB_ID VARCHAR (10),
SALARY DOUBLE(8,2),
COMM_PCT DOUBLE (4,2),
MGR_ID INT (6),
DEPARTMENT_ID INT (4)
);
insert into EMPLOYEE  values
(198, 'Connell', 'SH_CLERK ',2600 ,2.5, 124, 50);
insert into EMPLOYEE  values
(199,' Grant ','SH_CLERK', 2600 ,2.2 ,124 ,50),
(200,' Whalen',' AD_ASST', 4400, 1.3, 101, 10),
(201 ,'Hartstein' ,'IT_PROG' ,6000, null, 100, 20),
(202, 'Fay',' AC_MGR' ,6500, null ,210, 20),
(203 ,'Mavris' ,'AD_VP', 7500, null, 101, 40),
(204 ,'Baer' ,'AD_PRES', 3500, 1.5, 101, 90),
(205, 'Higgins', 'AC_MGR', 2300 ,null, 101, 60),
(206 ,'Gitz', 'IT_PROG', 5000, null, 103, 60),
(100 ,'King', 'AD_ASST', 8956 ,0.3, 108 ,100),
(101, 'Kochar', 'SH_CLERK', 3400 ,1.3, 118, 30);

SELECT EMPLOYEE_ID, last_name, job_id from EMPLOYEE  ; 
#Display the details of all employees of department 60

SELECT *from EMPLOYEE where DEPARTMENT_ID=60;
#Display the employee details of the employee who’s last_name is King

SELECT * from EMPLOYEE where LAST_NAME ="king";
# Display unique job_id from EMPLOYEE table. Give alias name to the column as JOB_TITLE.

 SELECT DISTINCT JOB_ID FROM EMPLOYEE;
 # Display last_name, salary and salary increase of Rs300. Give the new column name as ‘Increased Salary’.
 #Display the details of those employees who get commission
 
 select *from EMPLOYEE where COMM_PCT !="null";
 #Display the details of those employees who do not get commission
 
 select * from EMPLOYEE where COMM_PCT is null; 
 #Display the Employee_id, Department_id and Salary all employees whose salary is greater than 5000.
 
 SELECT  Employee_id, Department_id , Salary from EMPLOYEE where salary >5000;
 #Display the Last_Name and Salary of all employees whose salary is between 4000 and 7000
 
 SELECT LAST_NAME,SALARY from EMPLOYEE where salary between 4000 and 7000;
 #Display the details of all employees whose salary is either 6000 or 6500 or 7000.
 
 SELECT * from EMPLOYEE where salary = 6000 or salary= 6500 or salary= 7000;
# Display the details of all those employees who work either in department 10 or 20 or 30 or 50.

SELECT * from EMPLOYEE where DEPARTMENT_ID =10 or DEPARTMENT_ID= 20 or DEPARTMENT_ID= 30 or DEPARTMENT_ID=50;
#Display the details of all employees whose salary is not equal to 5000

select * from EMPLOYEE where salary !=5000;
#Display the details of all the CLERKS working in the organization.

select * from EMPLOYEE where JOB_ID="SH_CLERK";
#Update the job_id’s of the employees who earn more than 5000 to Grade_A Display the table EMPLOYEE after updating.

update EMPLOYEE set JOB_ID = "GRADE_A" where salary >5000;
#Display the details of all those employees who are either CLERK or PROGRAMMER or ASSISTANT.

select *from EMPLOYEE where JOB_ID = "SH_CLERK" or JOB_ID = "IT_PROG" or JOB_ID =" AD_ASST";
#Display those employees from the EMPLOYEE table whose designation is CLERK and salary is less than 3000.

select * from EMPLOYEE where JOB_ID = "SH_CLERK" and salary <3000;
#Display those employees Last_Name, Mgr_id from the EMPLOYEE table whose salary is above 3000 and work under Manager 101

SELECT LAST_NAME,MGR_ID from EMPLOYEE where salary >3000 and MGR_ID=101;

