# SmartMart – Java-Based Shopping Application

## Project Overview

SmartMart is a Java-based shopping application designed to manage customer activities, product information, and order-related operations. It follows a layered architecture to maintain separation of concerns, code reusability, and maintainability.

## Technologies Used

- **Programming Language:** Core Java
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** Eclipse
- **Version Control:** Git and GitHub

## Project Architecture

The application follows a layered architecture:

- **Model Layer:** Represents application entities and their data.
- **DAO Layer:** Handles database operations using JDBC.
- **Service Layer:** Contains business logic and validation.
- **Controller Layer:** Coordinates application requests and responses.

## Key Features

- Customer management
- Product management
- Order processing
- Database integration using JDBC
- Separation of business logic and database operations

## Concepts Implemented

- Object-Oriented Programming (OOP)
- Encapsulation
- Abstraction through interfaces
- DAO and Service design patterns
- Exception handling
- JDBC database connectivity
- CRUD operations

## Project Structure

```text
SmartMart/
├── src/
│   └── com.smartmart/
│       ├── model/
│       ├── dao/
│       ├── service/
│       └── controller/
├── .gitignore
└── README.md
```

*Note: Update the package structure above to match the actual project.*

## Database Configuration

1. Install MySQL.
2. Create the required database.
3. Configure the database URL, username, and password in your application.
4. Execute the required SQL scripts.
5. Run the Java application from Eclipse.

## How to Run

1. Clone this repository.
2. Import the project into Eclipse.
3. Configure the MySQL database connection.
4. Add the required MySQL JDBC driver.
5. Run the application's main class.

## GitHub Repository

https://github.com/aslesharaj82/SmartMart

---

**Developed as a Java application to practice object-oriented programming, JDBC, database operations, and layered application architecture.**