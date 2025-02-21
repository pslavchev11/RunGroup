# RunGroup - Running Club Management Application

RunGroup is a Spring Boot-based web application that allows users to manage running clubs and events. This project provides a platform for creating, updating, searching, and managing running clubs and their associated events.

---

## Table of Contents

- [Features](#features)
- [Screenshots](#screenshots)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
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



---

## Screenshots

### Main Window
[Main Window](https://github.com/user-attachments/assets/e224bfe3-2f8c-495a-a530-91e78f380c89)



### View(Club) - Button
[View](https://github.com/user-attachments/assets/70441e95-da1f-46ab-856f-f8cf4b3ff0de)


### Edit(Club) - Button
[Edit](https://github.com/user-attachments/assets/18cb017f-37d6-4501-81d0-c6a792b4bfe2)



### Create(Club) - Button
[Create](https://github.com/user-attachments/assets/98400011-0f92-4ccf-9471-ccb7f06ae210)



### View(Event) - Button
[View](https://github.com/user-attachments/assets/f311e9fc-7fe3-4122-bf4e-c140b3989214)



### Edit(Event) - Button
[Edit](https://github.com/user-attachments/assets/1be0d2f4-94c8-45b2-ab82-71a652ade7e1)



### Create(Event) - Button
[Create](https://github.com/user-attachments/assets/02b31d3c-bba9-4de5-b75a-7d2c8f861c5d)

### Login
[Login](https://github.com/user-attachments/assets/3bc0c512-93e2-44fa-a410-2549ca6767f0)

### Register
[Register](https://github.com/user-attachments/assets/759f5916-5fad-4eaf-b9a9-9ce43396b922)





---

## Technologies Used

### Frameworks:

- Spring Boot (Spring MVC, Spring Data JPA, Spring Security, Spring Validation)

### Languages:

- Java
- HTML, CSS (via Thymeleaf templates)

### Database:

- PostgreSQL

### Tools:

- Apache Tomcat (embedded in Spring Boot)
- Maven (build and dependency management)


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

5. Access the application in your web browser at: [http://localhost:8091](http://localhost:8091)

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

