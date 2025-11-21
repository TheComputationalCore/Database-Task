# SQL, JDBC & MongoDB Tasks

A clean, structured collection of database tasks involving **MySQL SQL queries**, **Java JDBC operations**, and **MongoDB queries**.  
This repository also includes screenshots demonstrating query outputs and program execution.

---

## 📁 Project Structure

```
.
├── 1.sql
├── MyDatabaseConnection.java
├── QuestionTwo.java
├── screenshots/
│   ├── 1.1.png
│   ├── 1.2.png
│   ├── 1.3.png
│   ├── 1.4.png
│   ├── 1.5.png
│   ├── 1.6.png
│   ├── 1.7.png
│   ├── 1.8.png
│   ├── 2.5.png
│   ├── 2.6.png
└── README.md
```

---

## 📝 Task 1 — SQL Queries on Employee Table

The `Empl` table contains employee information such as:

- `EName` — Employee Name
- `Sal` — Salary
- `Comm` — Commission
- `Job` — Job Title
- `Mgr` — Manager ID

### ✔ Screenshots

#### 🔹 Full Table View

![1.1](screenshots/1.1.png)

#### 🔹 Employees with salary ≥ 2200

![1.2](screenshots/1.2.png)

#### 🔹 Employees with NULL commission

![1.3](screenshots/1.3.png)

#### 🔹 Salary NOT between 2500 and 4000

![1.4](screenshots/1.4.png)

#### 🔹 Employees without a manager

![1.5](screenshots/1.5.png)

#### 🔹 Employees whose 3rd letter is 'A'

![1.6](screenshots/1.6.png)

#### 🔹 Employees whose name ends with 'T'

![1.7](screenshots/1.7.png)

#### 🔹 SQL Script Summary

![1.8](screenshots/1.8.png)

---

## 🧪 Task 2 — JDBC Employee Insert Program

Java program using JDBC to:

- Connect to MySQL
- Create `employee` table
- Insert 5 employee records

### ✔ Successful Connection Screenshot

![2.5](screenshots/2.5.png)

### ✔ Inserted Records Verification

![2.6](screenshots/2.6.png)

---

## 🍃 Task 3 — MongoDB Queries (Product Dataset)

Queries performed:

1. Retrieve all products
2. Find products priced between 400 and 800
3. Find products NOT priced between 400 and 600
4. First 4 products with price > 500
5. Retrieve product_name & product_material
6. Find product with `row_id = 10`
7. Delete products priced at 28
8. And more…

---

## ▶ How to Run

### **SQL**

```bash
mysql -u root -p
source 1.sql;
```

### **JDBC**

```bash
javac MyDatabaseConnection.java
javac QuestionTwo.java
java QuestionTwo
```

### **MongoDB**

```bash
mongoimport --db mydatabase --collection products --file product.json --jsonArray
```

---

## ✔ Requirements

- MySQL 5.7+ / MariaDB
- Java 8+
- MySQL Connector/J
- MongoDB 4.0+

---

## 📸 Screenshots Folder

All images included are sanitized and safe for public usage.  
Sensitive screenshots (`2.1`–`2.4`) were removed.

---

## 📌 Author

**TheComputationalCore**

---
