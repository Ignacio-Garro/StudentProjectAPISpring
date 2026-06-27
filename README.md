# Student Project API

A Spring Boot REST API for managing students, with full CRUD operations and ActiveMQ (JMS) messaging integration.

## Features

- **CRUD endpoints** for students (create, read, update, delete)
- **ActiveMQ / JMS** integration via `JmsTemplate` and a configured listener factory
- **Seed data** loaded on startup with a `CommandLineRunner`
- In-memory storage (list-based)

## Tech Stack

- Java + Spring Boot
- Spring Web (REST)
- Spring JMS + ActiveMQ
- JUnit (Spring Boot Test)

## Endpoints

| Method | Endpoint          | Description          |
|--------|-------------------|----------------------|
| GET    | `/students`       | Get all students     |
| GET    | `/students/{id}`  | Get a student by ID  |
| POST   | `/students`       | Add a new student    |
| PUT    | `/students/{id}`  | Update a student     |
| DELETE | `/students/{id}`  | Delete a student     |
| GET    | `/hello?myName=`  | Test endpoint        |

**Example body (POST/PUT):**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

## Getting Started

### Prerequisites
- JDK [17+ — confirm]
- Maven
- A running ActiveMQ broker on `tcp://localhost:61616`

### Run
```bash
mvn spring-boot:run
```
API available at `http://localhost:8080`.
# Student Project API

A Spring Boot REST API for managing students, with full CRUD operations and ActiveMQ (JMS) messaging integration.

## Features

- **CRUD endpoints** for students (create, read, update, delete)
- **ActiveMQ / JMS** integration via `JmsTemplate` and a configured listener factory
- **Seed data** loaded on startup with a `CommandLineRunner`
- In-memory storage (list-based)

## Tech Stack

- Java + Spring Boot
- Spring Web (REST)
- Spring JMS + ActiveMQ
- JUnit (Spring Boot Test)

## Endpoints

| Method | Endpoint          | Description          |
|--------|-------------------|----------------------|
| GET    | `/students`       | Get all students     |
| GET    | `/students/{id}`  | Get a student by ID  |
| POST   | `/students`       | Add a new student    |
| PUT    | `/students/{id}`  | Update a student     |
| DELETE | `/students/{id}`  | Delete a student     |
| GET    | `/hello?myName=`  | Test endpoint        |
