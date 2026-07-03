# University Staff Management System

## Project Description
The University Staff Management System is a Java console application developed using Object-Oriented Programming (OOP) concepts. The system manages permanent and temporary staff details, calculates their salaries, and displays all staff information.

---

## Features
- Add Permanent Staff
- Add Temporary Staff
- Store staff records using ArrayList
- Calculate staff salaries
- Display all staff details
- User input using Scanner
- Demonstrates Inheritance, Abstraction, Polymorphism, and Method Overriding

---

## OOP Concepts Used

### 1. Abstraction
- `Staff` is an abstract class.
- It contains the abstract method:
```java
abstract double calculateSalary();
```

### 2. Inheritance
- `PermanentStaff` extends `Staff`
- `TemporaryStaff` extends `Staff`

### 3. Polymorphism
The `calculateSalary()` and `displayDetails()` methods are overridden in both child classes.

### 4. Method Overriding
Each subclass provides its own implementation of:
- `calculateSalary()`
- `displayDetails()`

### 5. Encapsulation
Staff information is grouped inside classes.

---

## Classes

### Staff (Abstract Class)
Attributes:
- name
- staffID
- department

Methods:
- calculateSalary() (Abstract)
- displayDetails()

---

### PermanentStaff
Additional Attributes:
- basicSalary
- allowance

Salary Formula:
```
Salary = Basic Salary + Allowance
```

---

### TemporaryStaff
Additional Attributes:
- dailyWage
- workingDays

Salary Formula:
```
Salary = Daily Wage × Working Days
```

---

### University
Responsibilities:
- Store all staff objects
- Add staff
- Display all staff information

Uses:
```java
ArrayList<Staff>
```

---

### Main
Responsibilities:
- Create predefined staff objects
- Get user input
- Add staff to the university
- Display all staff details

---

## Technologies Used

- Java
- ArrayList
- Scanner
- Object-Oriented Programming (OOP)

---

## Project Structure

```
Staff (Abstract Class)

--PermanentStaff

--TemporaryStaff

--University

-- Main




## Sample Output

```
Enter Permanent Staff Details

Name: Amal
Staff ID: 103
Department: IT
Basic Salary: 85000
Allowance: 10000

Enter Temporary Staff Details

Name: Kasun
Staff ID: 203
Department: Science
Daily Wage: 2500
Working Days: 22

===== Staff Details =====

Name: Kamal
Staff ID: 101
Department: IT
Basic Salary: 80000.0
Allowance: 10000.0
Total Salary: 90000.0

-------------------------

Name: Amal
Staff ID: 103
Department: IT
Basic Salary: 85000.0
Allowance: 10000.0
Total Salary: 95000.0

-------------------------
```

---

## How to Run

### Compile

```bash
javac Main.java
```

### Run

```bash
java Main
```

---

## Learning Outcomes

This project demonstrates:
- Abstract Classes
- Inheritance
- Polymorphism
- Method Overriding
- Constructors
- ArrayList
- Scanner
- Object-Oriented Programming (OOP)

---

## Author

**Name:** Uditha Theekshana

**Course:** ICT / Object-Oriented Programming (Bsc in IT university of vavniya)

**Language:** Java
