-- Works with Postgres DB Only

DROP TABLE EMPLOYEE;

create table EMPLOYEE
(
    EMPID     NUMBER not null primary key,
    LASTNAME  VARCHAR2(255),
    FIRSTNAME VARCHAR2(255),
    ADDRESS   VARCHAR2(255),
    CITY      VARCHAR2(255),
    DEPTID    NUMBER,
    SALARY    FLOAT
);

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('1', 'Keshav', 'Manish', 'RockCove Ter', 'Ashburn', '1', '10000');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('2', 'Sal', 'Sandesh', 'Indiranagar', 'BLR', '2', '20000.00');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('3', 'Raj', 'Ritu', 'Noida', 'Delhi', '1', '30000.90');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('4', 'David', 'Jashua', 'Ter', 'Den', '9', '5000.45');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('5', 'Sri', 'Shreyas', 'Somewhere in Boston', 'Boston', '9', '300.33');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('6', 'Sri', 'Shreyas', 'Somewhere in Boston', 'Boston', '9', '300.33');


SELECT *
FROM EMPLOYEE;
--———————————————————————————————————————————————
DROP TABLE Bonus;

CREATE TABLE Bonus
(
    empID numeric primary key,
    bonus   numeric
);


INSERT INTO Bonus(empID, bonus) VALUES (1, 500);
INSERT INTO Bonus(empID, bonus) VALUES (4, 1000);

SELECT *
FROM Bonus;

--———————————————————————————————————————————————

--Fannie Mae Question 30th April 2025

--Select the employees who have a bonus.
SELECT e.FIRSTNAME, e.EMPID, e.SALARY
FROM EMPLOYEE e, Bonus b
WHERE e.EMPID = b.empID;
-- OR
SELECT e.FIRSTNAME, e.EMPID, e.SALARY
FROM EMPLOYEE e
JOIN Bonus b
ON e.EMPID = b.empID;
-- OR
SELECT e.FIRSTNAME, e.EMPID, e.SALARY
FROM EMPLOYEE e
INNER JOIN Bonus b
ON e.EMPID = b.empID;

--Now need all the employees who don't have a bonus also
SELECT e.empID, e.FirstName, e.LastName
FROM Employee e
LEFT JOIN Bonus b
ON e.empID = b.empID
WHERE b.bonus IS NULL;

--———————————————————————————————————————————————
--Employees whose salaries is less than average salary of employees
SELECT FIRSTNAME, EMPID, SALARY
FROM EMPLOYEE
WHERE SALARY < (SELECT Avg(SALARY) AS avg_sal FROM EMPLOYEE);
