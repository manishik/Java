--Updated on 29th April 2025

--Works with ORACLE Database 19.0
--—————————————————————————————————————————
DROP TABLE EMPLOYEE;

CREATE TABLE Employee
(
    empID int primary key,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
    DeptID int,
    Salary float
);

DROP TABLE Department;

CREATE TABLE Department
(
    DeptID int primary key,
    DeptName varchar(255)
);

--—————————————————————————————————————————

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('1','Keshav','Manish','RockCove Ter','Ashburn','1', '280000.00');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('2','Kumar','Pradeep','Indiranagar','BLR','2', '20000.00');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('3','Raj','Ritu','Noida','Delhi','1', '30000.90');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('4','Rao','Kiran','Ter','Den','9', '5000.45');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('5','Prasad','Krishna','Somewhere in Boston','Boston','9', '300.33');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID, Salary)
VALUES ('6','Srinath','Shreyas','Somewhere in Boston','Boston','9', '300.33');

--—————————————————————————————————————————

INSERT INTO Department(DeptID, DeptName)
VALUES ('1','Software');

INSERT INTO Department(DeptID, DeptName)
VALUES ('2','Operations');

INSERT INTO Department(DeptID, DeptName)
VALUES ('3','HR');

INSERT INTO Department(DeptID, DeptName)
VALUES ('4','Finance');

INSERT INTO Department(DeptID, DeptName)
VALUES ('5','Security');

INSERT INTO Department(DeptID, DeptName)
VALUES ('9','Info Security');
--—————————————————————————————————————————
commit;

select * FROM Employee;
select * FROM Department;

--—————————————————————————————————————————
--JOINS:

--INNER JOIN
--(Works if both below queries are executed)

SELECT empID, Firstname
FROM Employee e, Department d
WHERE e.DEPTID = d.DEPTID;

--OR

SELECT empID, Firstname, LastName
FROM Employee
INNER JOIN Department
ON Employee.Deptid = Department.DeptId;

--OR

SELECT empID, Firstname, LastName
FROM Employee e
INNER JOIN Department d
ON e.Deptid = d.DeptId;
--—————————————————————————————————————————

--LEFT OUTER JOIN

SELECT Employee.FirstName, Department.DeptName
FROM Employee
LEFT JOIN Department
ON Employee.DeptID=Department.DeptID
ORDER BY Employee.EmpID;

-- Gets all rows from Employee Table
--—————————————————————————————————————————

--RIGHT OUTER JOIN

SELECT Employee.FirstName, Department.DeptName
FROM Employee
RIGHT JOIN Department
ON Employee.DeptID=Department.DeptID
ORDER BY Employee.EmpID;

-- Gets all rows from Department Table
--—————————————————————————————————————————

--FULL JOIN

SELECT *
FROM Employee
FULL OUTER JOIN Department
ON Employee.DeptID=Department.DeptID
ORDER BY Employee.EmpID;

--—————————————————————————————————————————

--FULL JOIN in MySQL Database:

Select *
FROM Employee
LEFT JOIN Department
ON Employee.DeptID=Department.DeptID
UNION
Select *
FROM Employee
RIGHT JOIN Department
ON Employee.DeptID=Department.DeptID;

--—————————————————————————————————————————

--GROUP BY:

-- Count the number of employees per department
SELECT DeptId, COUNT(EmpId) AS "Number of Employees"
FROM Employee
GROUP BY DeptId;


-- Gets the department name instead of DeptId in the result

SELECT dept.DeptName as "Department", count(emp.empid) as NoOfEmployees
FROM Employee emp, Department dept
WHERE emp.deptid = dept.DeptId
GROUP by dept.DeptName;

-- Gets the department-wise total salaries

SELECT dept.DeptName, sum(emp.salary) as TotalSalaries
FROM Employee emp, Department dept
WHERE emp.deptid = dept.DeptId
GROUP by dept.DeptName;

--—————————————————————————————————————————

SELECT d.deptid, e.firstname, sum(e.salary) as TotalSalary
FROM Employee e, Department d
WHERE e.deptid = d.DeptId
GROUP BY
    d.deptid,
    e.firstname
HAVING
    sum(e.salary) > 10000.0;


