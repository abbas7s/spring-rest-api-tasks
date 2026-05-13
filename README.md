# Spring REST API – Task 2

This project was created in Java using Spring Boot framework.

The main goal of the project was to learn how REST API works in Spring and how different layers of the application communicate with each other.

The application allows creating products using HTTP requests and testing endpoints in Swagger UI.

---

# Technologies

The following technologies were used in this project:

- Java
- Spring Boot
- Maven
- Swagger OpenAPI
- H2 Database
- GitHub

---

# Project Structure

The project is divided into several parts:

- controller
- service
- repository
- domain
- request/response DTOs
- mapper

Package structure:

```text
product
├── api
│   ├── request
│   └── response
├── domain
├── repository
├── service
└── support

Each layer has its own responsibility.

Controller handles HTTP requests
Service contains business logic
Repository stores data
DTO classes are used for requests and responses
Running the Application

To start the application:

Open the project in IntelliJ IDEA
Run FirstRespApiApplication
Wait until Spring Boot starts

The application runs on:

http://localhost:8080
Swagger Documentation

Swagger UI is available at:

http://localhost:8080/swagger-ui/index.html

Swagger was used to test the API directly in the browser.

API Endpoint

The project contains one endpoint:

POST /api/v1/products

This endpoint creates a new product.

Example request:

{
  "name": "Laptop"
}

Example response:

{
  "id": 1,
  "name": "Laptop"
}
HTTP Method

The project uses HTTP POST method.

@PostMapping is used to create the endpoint.

@RequestBody is used to receive JSON data from the request.

Database

The project uses H2 in-memory database.

The database works only while the application is running.

Testing

The application was tested using Swagger UI.

Steps:

Start the application
Open Swagger URL
Click "Try it out"
Send request
Check response
GitHub Repository

Repository link:

https://github.com/abbas7s/spring-rest-api-tasks

# Running the Application

To start the application:

1. Open the project in IntelliJ IDEA
2. Run `FirstRespApiApplication`
3. Open browser and go to:

```text
http://localhost:8080/swagger-ui/index.html
```

Swagger UI allows testing REST endpoints directly in the browser.

---

# Available Endpoint

## Create Product

HTTP Method:

```text
POST /api/v1/products
```

Example request body:

```json
{
  "name": "Phone"
}
```

Example response:

```json
{
  "id": 1,
  "name": "Phone"
}
```

---

# Screenshots

## Swagger UI

<img width="1920" height="1080" alt="Screenshot 2026-05-14 at 01 49 04 (2)" src="https://github.com/user-attachments/assets/32330690-5034-455f-b720-ab5e98bd8e61" />
<img width="1710" height="1107" alt="Screenshot 2026-05-14 at 01 49 04" src="https://github.com/user-attachments/assets/2e8f606d-57ba-478c-9b46-ba6d5be3b275" />


## Example Request

<img width="1920" height="1080" alt="Screenshot 2026-05-14 at 01 48 15 (2)" src="https://github.com/user-attachments/assets/3f555641-1dd3-48a0-bf59-b2a665824c1b" />
<img width="1710" height="1107" alt="Screenshot 2026-05-14 at 01 48 15" src="https://github.com/user-attachments/assets/b6964da5-fccb-4ee2-8e1f-9cde8bf4f474" />


## Example Response

<img width="1920" height="1080" alt="Screenshot 2026-05-14 at 01 48 37 (2)" src="https://github.com/user-attachments/assets/660e0b16-c363-435a-8d48-f694354c75d2" />
<img width="1710" height="1107" alt="Screenshot 2026-05-14 at 01 48 37" src="https://github.com/user-attachments/assets/95a84d22-d652-4f30-b0a1-71617477c145" />

---

# Author

Project created by Abbas Asanov for university assignment.

