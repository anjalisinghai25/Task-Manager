# To-Do List Application

## Overview
This is a simple To-Do List application built using **Spring Boot** and **MySQL**. The application provides RESTful APIs for managing tasks, including creating, updating, retrieving, and deleting tasks.

## Features
- Create a new task with a title and description.
- Retrieve all tasks or a specific task by ID.
- Update task details including title, description, and completion status.
- Delete a task by ID.
- Uses **Spring Boot**, **Spring Data JPA**, and **MySQL**.
- OpenAPI documentation available with **SpringDoc OpenAPI UI**.

## Technologies Used
- **Spring Boot** (2.7.5)
- **Spring Data JPA**
- **Spring Boot DevTools**
- **MySQL Database**
- **SpringDoc OpenAPI UI**
- **Maven** (for dependency management)
- **Java 17**

## Installation and Setup
### Prerequisites
Ensure you have the following installed:
- Java 17
- Maven
- MySQL Server

### Clone the Repository
```sh
git clone https://github.com/your-username/todoapp.git
cd todoapp
```

### Configure Database
Create a MySQL database and update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### Build and Run the Application
```sh
mvn spring-boot:run
```

### API Endpoints
| HTTP Method | Endpoint       | Description |
|------------|--------------|-------------|
| POST       | `/todo`      | Create a new task |
| GET        | `/todo`      | Get all tasks |
| GET        | `/todo/{id}` | Get a task by ID |
| PUT        | `/todo/{id}` | Update a task by ID |
| DELETE     | `/todo/{id}` | Delete a task by ID |

### OpenAPI Documentation
After running the application, visit:
```
http://localhost:8080/swagger-ui/index.html
```
to explore the APIs.

## Project Structure
```
├── src/main/java/com/todo/todoapp
│   ├── Controller
│   │   ├── TaskController.java
│   ├── Entities
│   │   ├── Task.java
│   ├── Repository
│   │   ├── TaskRepository.java
│   ├── Services
│   │   ├── TaskService.java
│   ├── TodoAppApplication.java
├── pom.xml
├── README.md
```

## Future Enhancements
- Add a frontend using React or Thymeleaf.
- Implement user authentication and authorization.
- Add task due dates and priority levels.

---
**Author:** Anjali Singhai

