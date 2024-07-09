# Bank Project

## Project Description

**Bank** The "Bank" project is a microservices-based banking application that provides functionalities for creating and managing bank accounts, issuing and paying bills, account deposits, and user notifications. The project's architecture includes several microservices, each responsible for a specific part of the functionality.

**Location:** Yerevan  
**Date:** 04/2024

**Developer:**  
Web Development in Java  
**Name:** Gagikovich Gor Mkhitaryan

**Project URL:** [https://github.com/mypy125/SpringCloudMicroserviceArchitecture](https://github.com/mypy125/SpringCloudMicroserviceArchitecture)

## Microservices

### account-service

- **Description:** Service for creating new bank accounts.
- **Technologies:** Spring Web, Spring Data JPA, PostgreSQL.

### bill-service

- **Description:** Service for creating, updating, and storing bills.
- **Technologies:** Spring Web, Spring Data JPA, PostgreSQL.

### deposit-service

- **Description:** Service for account deposits.
- **Interaction:** Exchanges HTTP requests with account-service and bill-service.
- **Technologies:** Spring Web, Spring Data JPA, PostgreSQL.

### notification-service

- **Description:** Service for sending notifications to users.
- **Interaction:** Uses RabbitMQ to receive messages from deposit-service and send email notifications.
- **Technologies:** Spring Mail, Spring AMQP.

### config-service

- **Description:** Service for managing the configuration of other microservices.
- **Technologies:** Spring Cloud Config.

### gateway

- **Description:** API gateway for routing requests to the appropriate microservices.
- **Technologies:** Spring Cloud Gateway, Netflix Zuul.

### registry

- **Description:** Service for registering and discovering microservices.
- **Technologies:** Netflix Eureka.

## Technology Stack

- **Spring Web** For creating RESTful web services.
- **Spring Data JPA** For database interactions.
- **Spring CloudL** For implementing various microservice architecture patterns.
- **Spring Actuator** For monitoring and managing applications.
- **Spring Config** For centralized configuration management.
- **Spring Security** for ensuring security
- **Spring Sleuth** For distributed tracing.
- **Spring OpenFeign** For simplifying HTTP client creation.
- **Netflix Eureka** For microservices registration and discovery.
- **Netflix Zuul** For routing and filtering requests.
- **Netflix Hystrix** For fault tolerance.
- **Spring Mail** For sending email notifications.
- **Spring AMQP** For working with message queues (RabbitMQ).
- **PostgreSQL** As the main database.
- **H2 Database** As an embedded database for testing.