# SQL + JDBC + MongoDB Tasks

![Java Build](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/java-build.yml/badge.svg)
![Markdown Lint](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/markdown-lint.yml/badge.svg)
![Prettier Format](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/prettier-format.yml/badge.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A structured repository containing SQL queries, JDBC operations,
and MongoDB tasks. The project demonstrates backend fundamentals
using MySQL, Java, and MongoDB.

## Project Structure

```
sql-jdbc-mongodb-tasks/
├── .github/workflows/
├── screenshots/
├── 1.sql
├── MyDatabaseConnection.java
├── QuestionTwo.java
├── MONGODB TASK.docx
├── README.md
└── LICENSE
```

## Task 1 – SQL Queries

These SQL queries run on the `Empl` table.

### Screenshots

![Full Table](screenshots/1.1.png)

![Salary ≥ 2200](screenshots/1.2.png)

![NULL Commission](screenshots/1.3.png)

![Not Between 2500 and 4000](screenshots/1.4.png)

![No Manager](screenshots/1.5.png)

![Third Letter A](screenshots/1.6.png)

![Ends With T](screenshots/1.7.png)

![SQL Script](screenshots/1.8.png)

## Task 2 – JDBC (Java)

### Database Connection

![JDBC Connection](screenshots/2.5.png)

### Output

![Connection Created](screenshots/2.6.png)

## Task 3 – MongoDB Queries

Queries performed on a product dataset.  
See `MONGODB TASK.docx`.

## Run Instructions

### SQL

```sql
mysql -u root -p
use tasks;
source 1.sql;
```

### Java

```bash
javac MyDatabaseConnection.java QuestionTwo.java
java MyDatabaseConnection
java QuestionTwo
```

### MongoDB

```bash
mongoimport --db mydatabase   --collection products   --file product.json   --jsonArray
```

## License

MIT License
