# 🧪 API Automation Framework

This is a Java-based REST API Automation framework built using Rest Assured, TestNG, Maven, and integrated with tools like Allure, Extent Report, Jenkins, GitHub, and MySQL for CI/CD and complete test coverage.

---

## 🔧 Tech Stack

| Layer                         | Tool/Library                      |
|-------------------------------|-----------------------------------|
| Programming Language          | Java                              |
| API Testing Framework         | Rest Assured                      |
| HTTP Methods Support          | GET, POST, PUT, PATCH, DELETE     |
| Schema Validation             | JSON Schema (Rest Assured)        |
| Test Framework                | TestNG                            |
| Assertions                    | AssertJ, TestNG Assertions        |
| Data Driven Testing           | Apache POI / Excel / DataProvider |
| Serialization/Deserialization | Jackson API / Gson (POJO Mapping) |
| Logging                       | Log4j                             |
| Reporting                     | Allure Report, Extent Report      |
| Build & Dependency Mgmt       | Maven                             |
| Version Control               | Git                               |
| CI/CD                         | Jenkins                           |
| Repository Hosting            | GitHub / GitLab / Bitbucket       |
| Database                      | MySQL with JDBC Connector         |

---

## 📂 Folder Structure

```
api-automation/
├── src/
│   ├── main/java/
│   │   ├── pojo/                   # POJO classes for request/response
│   │   ├── utils/                  # Utility classes (Logger, Excel, Config)
│   │   └── base/                   # Base classes
│   └── test/java/
│       ├── tests/                 # Test classes
│       └── testng.xml            # TestNG suite
├── testdata/                     # Excel files or external payloads
├── reports/                      # Allure & Extent Reports
├── target/                       # Compiled classes & reports
├── pom.xml                       # Maven Project File
└── README.md                     # Project Documentation
```

---

## 🚀 Features

- REST API Testing using Rest Assured
- Request Payload via POJO, JSON files, or Excel (Apache POI)
- Response validation (status code, body, headers)
- JSON Schema Validation
- Data-driven testing from Excel
- Logging with Log4j
- HTML Reporting with Allure & Extent
- Build management with Maven
- CI Integration with Jenkins
- Git version control
- MySQL Database Connectivity via JDBC

---

## 📦 Dependencies (pom.xml)

```xml
<dependencies>
  <!-- Rest Assured -->
  <dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.3.1</version>
  </dependency>

  <!-- TestNG -->
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
  </dependency>

  <!-- AssertJ -->
  <dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.24.2</version>
  </dependency>

  <!-- Jackson (Pojo Mapping) -->
  <dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
  </dependency>

  <!-- Gson (Optional) -->
  <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
  </dependency>

  <!-- Apache POI (Excel) -->
  <dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
  </dependency>

  <!-- Log4j -->
  <dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
  </dependency>

  <!-- Allure Report -->
  <dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-testng</artifactId>
    <version>2.23.0</version>
  </dependency>

  <!-- Extent Reports -->
  <dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.1.1</version>
  </dependency>

  <!-- MySQL JDBC Connector -->
  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
  </dependency>
</dependencies>
```

---

## 🧪 How to Run Tests

📌 Using Maven:
```bash
mvn clean test
```

📌 With Allure Report:
```bash
allure serve target/allure-results
```

📌 In Jenkins:
- Create a Maven Job
- Pull code from GitHub
- Use build step: mvn clean test

---

## 📈 Reports

- Allure: target/allure-results
- TestNG: test-output/index.html

---

## 📘 Version Control

Push project to GitHub:
```bash
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/your-username/api-automation-restassured.git
git branch -M main
git push -u origin main
```



