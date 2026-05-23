# 🎓 University Management System

A Java-based desktop application for managing university administrative tasks, built as a semester project for **CSC 210 – Object Oriented Programming** at Bahria University Karachi Campus.

---

## 📋 Overview

The University Management System (UMS) is a desktop application that allows administrators to manage student and faculty records through a clean graphical interface. It supports adding, updating, and deleting records, managing leave applications, entering exam marks, and viewing student results — all backed by a MySQL database.

---

## ✨ Features

### 🔐 Authentication
- **Splash Screen** – Animated loading screen on startup
- **Login** – Secure credential-based login for admin access

### 👨‍🎓 Student Management
- **Add Student** – Enter and save new student details
- **Update Student** – Edit existing student records
- **Student Information** – View all stored student records (search by roll number)

### 👨‍🏫 Teacher Management
- **Add Teacher** – Enter and save new teacher details
- **Update Teacher** – Edit existing teacher records
- **Teacher Information** – View all stored teacher records (search by employee ID)

### 📝 Academics
- **Add Student Marks** – Enter subject-wise marks per semester (up to 8 subjects)
- **Student Result** – View a student's result card by roll number

### 🏖️ Leave Management
- **Apply Student Leave** – Submit a leave request for a student
- **Apply Teacher Leave** – Submit a leave request for a teacher
- **Student Leave Information** – View, search, and delete student leave records
- **Teacher Leave Information** – View, search, and delete teacher leave records

### 🏠 Dashboard
- **Home Page** – Central hub linking to all features with a logout option

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java |
| Frontend | Java Swing |
| Backend | Java (JDBC) |
| Database | MySQL |
| DB Driver | MySQL Connector/J (`com.mysql.cj.jdbc.Driver`) |
| IDE | Apache NetBeans |
| External Library | `DbUtils` (rs2xml) for table rendering |

---

## 🧱 OOP Concepts Demonstrated

- **Class & Object** – Each UI screen is its own class instantiated as needed
- **Encapsulation** – Data and methods bundled together within classes
- **Abstraction** – Internal database logic hidden from the UI layer
- **Inheritance** – Swing component classes extended for custom forms
- **Polymorphism** – Event listeners handle method behavior based on context
- **Exception Handling** – `try-catch` blocks throughout for safe DB operations

---

## 🗄️ Database Setup

1. Install **MySQL** and start the server on port `3306`.
2. Create a database named `universitymanagementsystem`.
3. Create the following tables:

```sql
-- Students
CREATE TABLE student (
    name VARCHAR(50),
    fname VARCHAR(50),
    rollno VARCHAR(20) PRIMARY KEY,
    dob VARCHAR(20),
    address VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(50),
    class_x VARCHAR(10),
    class_xii VARCHAR(10),
    reg VARCHAR(20),
    course VARCHAR(30),
    branch VARCHAR(30)
);

-- Teachers
CREATE TABLE teacher (
    name VARCHAR(50),
    fname VARCHAR(50),
    empid VARCHAR(20) PRIMARY KEY,
    dob VARCHAR(20),
    address VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(50),
    reg VARCHAR(20),
    education VARCHAR(20),
    department VARCHAR(30)
);

-- Login credentials
CREATE TABLE login (
    username VARCHAR(30),
    password VARCHAR(30)
);
INSERT INTO login VALUES ('admin', 'admin');

-- Subjects
CREATE TABLE subject (
    rollno VARCHAR(20),
    semester VARCHAR(20),
    subject1 VARCHAR(30), subject2 VARCHAR(30), subject3 VARCHAR(30), subject4 VARCHAR(30),
    subject5 VARCHAR(30), subject6 VARCHAR(30), subject7 VARCHAR(30), subject8 VARCHAR(30)
);

-- Marks
CREATE TABLE marks (
    rollno VARCHAR(20),
    semester VARCHAR(20),
    marks1 VARCHAR(10), marks2 VARCHAR(10), marks3 VARCHAR(10), marks4 VARCHAR(10),
    marks5 VARCHAR(10), marks6 VARCHAR(10), marks7 VARCHAR(10), marks8 VARCHAR(10)
);

-- Student Leave
CREATE TABLE studentleave (
    rollno VARCHAR(20),
    date VARCHAR(20),
    duration VARCHAR(20)
);

-- Teacher Leave
CREATE TABLE teacherleave (
    empid VARCHAR(20),
    date VARCHAR(20),
    duration VARCHAR(20)
);
```

4. In `Conn.java`, update the connection string if your MySQL root password is set:

```java
c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/universitymanagementsystem",
    "root",
    "your_password_here"  // leave empty string if no password
);
```

---

## 🚀 Prerequisites

- Java JDK 8 or above
- MySQL Server 8.x
- Apache NetBeans IDE (recommended) or any Java IDE
- MySQL Connector/J JAR
- `rs2xml.jar` (for `DbUtils.resultSetToTableModel`)

---

## 📁 Project Structure

```
UniversityManagementSystem/
│
├── Conn.java              # Database connection handler
├── splash.java/.form      # Startup loading screen
├── login.java/.form       # Login authentication
├── home.java/.form        # Main dashboard
│
├── addstd.java/.form      # Add student
├── upstd.java/.form       # Update student
├── viewstud.java/.form    # View student records
│
├── addTeacher.java/.form  # Add teacher
├── uptchr.java/.form      # Update teacher
├── viewteacher.java/.form # View teacher records
│
├── exam.java/.form        # Enter student marks
├── showresult.java/.form  # View student results
│
├── stdleave.java/.form    # Apply student leave
├── sldetail.java/.form    # Student leave details
├── teachleave.java/.form  # Apply teacher leave
├── tldetail.java/.form    # Teacher leave details
│
└── *.png / *.jpg          # UI assets
```

---

## 📸 Screenshots

| Screen | Description |
|--------|-------------|
| Splash Screen | Animated loading screen with progress bar |
| Login Page | Credential-based admin login |
| Home Page | Dashboard with navigation to all modules |
| Add Student | Form to register a new student |
| Student Result | Result card showing subject-wise marks |

---

## 🔮 Future Improvements

- Role-based access (separate portals for admin, faculty, students)
- AI-driven academic recommendations
- Email notifications for leave approvals
- Report generation and PDF export
- Password hashing for secure authentication

---

## 📄 License

This project was developed for academic purposes as part of the BSE curriculum at Bahria University Karachi Campus. Not intended for production use.
