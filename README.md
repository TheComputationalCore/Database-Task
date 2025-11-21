# 📘 Database Tasks — SQL, JDBC, and MongoDB Exercises

![License](https://img.shields.io/badge/License-MIT-green.svg)
![Java](https://img.shields.io/badge/Java-100%25-orange)
![SQL](https://img.shields.io/badge/SQL-MySQL-blue)
![MongoDB](https://img.shields.io/badge/MongoDB-Queries-green)

This repository contains completed solutions for **SQL**, **JDBC**, and **MongoDB** tasks.

---

## 📁 Project Structure

```
.
├── 1.sql
├── MyDatabaseConnection.java
├── QuestionTwo.java
├── MONGODB TASK.docx
├── screenshots/
│   ├── Screenshot1.png
│   ├── Screenshot2.png
│   └── Screenshot3.png
└── README.md
```

---

## 🧩 Task 1 — SQL Queries (Employee Table)

This task includes SQL operations on the `Empl` table.

### 🖼 Screenshot — SQL Task  
![SQL Screenshot](screenshots/Screenshot1.png)

### Queries Included
- Employees with salary ≥ 2200  
- Employees without commission  
- Employees not in 2500–4000 range  
- Employees without a manager  
- Names with “A” as the third letter  
- Names ending with “S”

---

## 🧩 Task 2 — JDBC Employee Data Insertion

A Java program that:
- Creates an `employee` table  
- Inserts sample employee records  
- Connects to MySQL using JDBC  
- Logs success messages  

### 🖼 Screenshot — JDBC Program  
![JDBC Screenshot](screenshots/Screenshot2.png)

---

## 🧩 Task 3 — MongoDB Product Dataset Queries

Queries such as:
- Retrieve all products  
- Price-based filters  
- Material and color search  
- Deleting items  
- Field projection  

### 🖼 Screenshot — MongoDB Output  
![MongoDB Screenshot](screenshots/Screenshot3.png)

---

## 🛠 How to Run

### ▶ SQL
Open `1.sql` in MySQL Workbench and execute.

### ▶ JDBC
```bash
javac QuestionTwo.java
java QuestionTwo
```

### ▶ MongoDB
```bash
mongoimport --db mydatabase --collection products --file product.json --jsonArray
```

---

## 📦 Requirements

- MySQL / MariaDB  
- JDK 8+  
- MongoDB  
- MySQL Connector/J  

---

## 📜 License

Licensed under the **MIT License**.
