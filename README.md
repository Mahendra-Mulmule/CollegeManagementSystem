# CollegeManagementSystem
# 🎓 College Management System

A console-based Java application using JDBC and MySQL to perform basic CRUD operations on college records. This project is designed to demonstrate database connectivity and data handling using Java.

---

## 🛠️ Tech Stack

- 💻 Java (Core + JDBC)
- 🗃️ MySQL
- 🧠 SQL Queries
- 🧩 Eclipse IDE
- 📦 JDBC Driver (MySQL Connector)

---

## 📌 Features

- ➕ Add College
- 🔍 View College by ID
- 📋 List All Colleges
- ❌ Delete College by ID
- ✅ Uses Prepared Statements to prevent SQL injection
- 🔌 Live database connection with error handling

---

## 🗂️ Project Structure

src/
└── College_information/
├── College.java // POJO class
├── College_interface.java // Interface with method signatures
├── College_interface_impliment.java // JDBC logic
└── Main.java // Console menu for user interaction

pgsql
Copy
Edit

---

## 🧪 Database Setup

```sql
**CREATE DATABASE college_db;

USE college_db;

CREATE TABLE college (
    id INT PRIMARY KEY,
    collegename VARCHAR(100),
    location VARCHAR(100),
    collegetype VARCHAR(50),
    avg_fee INT
);
📝 Note: Update your DB credentials in College_interface_impliment.java before running the application.

▶️ How to Run
Open project in Eclipse

Ensure MySQL is running and table is created

Add MySQL JDBC Connector to project Build Path

Run Main.java and use the menu to perform operations

🙋 Author
👨‍💻 Mahendra Mulmule

📃 License
This project is open-source and free to use under the MIT License.

yaml
Copy
Edit

---
**
