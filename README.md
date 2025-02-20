# RunGroup - Running Club Management Application

RunGroup is a Spring Boot-based web application that allows users to manage running clubs and events. This project provides a platform for creating, updating, searching, and managing running clubs and their associated events.

---

## Table of Contents

- [Features](#features)
- [Screenshots](#screenshots)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Authentication & Authorization](#authentication--authorization)
- [API Endpoints](#api-endpoints)
- [Thymeleaf Templates](#thymeleaf-templates)

---

## Features

### Manage Clubs:

- Create, update, delete, and list running clubs.
- Search for clubs by name or details.

### Manage Events:

- Create events for specific clubs.
- Update and delete events.
- View event details.

### User Authentication:

- Register a new user account.
- Login and logout functionality.
- Secure access to certain features based on user roles.

### Downloadable Files:

- Generate and download files such as JSON files for export.

---

## Screenshots

### Main Window



### View(Club) - Button



### Edit(Club) - Button



### Create(Club) - Button



### View(Event) - Button



### Edit(Event) - Button



### Create(Event) - Button



---

## Technologies Used

### Frameworks:

- Spring Boot (Spring MVC, Spring Data JPA, Spring Security, Spring Validation)

### Languages:

- Java
- HTML, CSS (via Thymeleaf templates)

### Database:

- H2 Database (in-memory database for development)

### Tools:

- Apache Tomcat (embedded in Spring Boot)
- Maven (build and dependency management)

---

## Project Structure

```
RunGroup
|-- src
|   |-- main
|   |   |-- java/com/rungroup/web/controller
|   |   |   |-- ClubController.java
|   |   |   |-- EventController.java
|   |   |   |-- AuthController.java
|   |   |-- java/com/rungroup/web/dto
|   |   |-- java/com/rungroup/web/models
|   |   |-- java/com/rungroup/web/service
|   |   |-- java/com/rungroup/web/repository
|   |   |-- resources/templates
|   |       |-- clubs-list.html
|   |       |-- clubs-create.html
|   |       |-- clubs-detail.html
|   |       |-- clubs-edit.html
|   |       |-- login.html
|   |       |-- register.html
|   |       |-- layout.html
|   |-- test
|-- pom.xml
```

---

## Installation

### Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/pslavchev11/RunGroup.git
   ```

2. Navigate to the project directory:

   ```bash
   cd RunGroup
   ```

3. Build the project:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

5. Access the application in your web browser at: [http://localhost:8080](http://localhost:8080)

---

## Authentication & Authorization

### User Registration & Login

- **Register a new account:** Navigate to `/register` and complete the signup form.
- **Login:** Navigate to `/login` to sign in with your credentials.
- **Logout:** Click the logout button to securely end your session.
- **Access Control:** Certain features are restricted to authenticated users.

---

## API Endpoints

### Authentication Endpoints

| Method | Endpoint    | Description               |
| ------ | ----------- | ------------------------- |
| GET    | `/login`    | Display login form        |
| POST   | `/login`    | Authenticate user         |
| GET    | `/register` | Display registration form |
| POST   | `/register` | Register a new user       |
| GET    | `/logout`   | Logout user               |

---

## Thymeleaf Templates

The project uses Thymeleaf for dynamic HTML content generation. Key templates include:

- **clubs-list.html** - Displays a list of clubs with a search form.
- **clubs-create.html** - Form for creating a new club.
- **clubs-detail.html** - Details of a specific club and associated events.
- **clubs-edit.html** - Form for editing a club.
- **login.html** - User login form.
- **register.html** - User registration form.

