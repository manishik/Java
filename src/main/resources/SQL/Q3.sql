CREATE TABLE students(id int, name varchar(50), branch varchar(50));
CREATE TABLE marks(id int, marks int);
CREATE TABLE attendance(id int, attendance int);

--students
INSERT INTO students VALUES(1,'manish','cse');
INSERT INTO students VALUES(2,'harsh','ece');
INSERT INTO students VALUES(3,'kiran','ece');
INSERT INTO students VALUES(4,'joe','cse');

--marks
INSERT INTO marks VALUES(1,95);
INSERT INTO marks VALUES(2,85);
INSERT INTO marks VALUES(3,80);
INSERT INTO marks VALUES(4,65);

--attendance
INSERT INTO attendance VALUES(1,75);
INSERT INTO attendance VALUES(2,65);
INSERT INTO attendance VALUES(3,80);
INSERT INTO attendance VALUES(4,80);

SELECT * FROM students;
SELECT * FROM marks;
SELECT * FROM attendance;

-- Multiple Joins
SELECT s.id, name, marks, attendance
FROM students s
INNER JOIN marks m
ON s.id = m.id
INNER JOIN attendance a
ON m.id = a.id
WHERE a.attendance >= 75;
