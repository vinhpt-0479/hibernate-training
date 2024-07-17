CREATE DATABASE hibernate;

USE hibernate;

-- one-to-one
CREATE TABLE Person (
    person_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Passport (
    passport_id INT PRIMARY KEY,
    passport_number VARCHAR(50),
    person_id INT,
    FOREIGN KEY (person_id) REFERENCES Person(person_id)
);

-- one-to-many
CREATE TABLE Department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100)
);

CREATE TABLE Employee (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

-- many-to-many
CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100)
);

CREATE TABLE Student_Course (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);