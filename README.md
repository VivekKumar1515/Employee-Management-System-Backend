# Employee Management System Backend

This project is the backend component of an Employee Management System, built using Spring Boot. It handles various operations such as creating, reading, updating, and deleting employee information. The backend is structured following the MVC (Model-View-Controller) architecture pattern.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL

## Project Setup

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Dependencies

The following dependencies are included in the `pom.xml` file:
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Connector Java
- Spring Boot Starter Test

### Configuration

1. **Database Configuration**: Update your database configuration in the `application.properties` file.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

2. **Running the Application**: Use the following command to run the application:

    ```bash
    mvn spring-boot:run
    ```

## Project Structure

- **Model**: Contains entity classes representing the database tables.
- **Repository**: Contains interfaces for database interactions.
- **Controller**: Contains REST controllers that handle HTTP requests and responses.
- **Service**: Contains business logic.

## MVC Architecture

### Model

The model represents the data structure. For instance, the `Employee` entity class defines the properties of the employee and their corresponding database fields.

### Repository

The repository interfaces handle database operations. The `EmployeeRepository` interface extends `JpaRepository` to provide CRUD operations for the Employee entity.

### Controller

The REST controller handles incoming requests. The `EmployeeController` class defines endpoints for fetching all employees, adding a new employee, updating an existing employee, and deleting an employee.

### Service

The service layer contains business logic. It interacts with the repository layer to perform database operations and with the controller layer to handle HTTP requests.

## API Endpoints

- `GET /api/employees` - Fetch all employees.
- `POST /api/employees` - Add a new employee.
- `PUT /api/employees/{id}` - Update an existing employee.
- `DELETE /api/employees/{id}` - Delete an employee.

## Cross-Origin Resource Sharing (CORS)

The application allows cross-origin requests from other applications. This is configured in the `EmployeeController` with the `@CrossOrigin` annotation.

## Conclusion

This backend project for the Employee Management System provides a solid foundation for handling employee data with Spring Boot.

---
