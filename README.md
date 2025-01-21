
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

### Downloadable Files:
- Generate and download files such as JSON files for export.

---
## Screenshots

### Main Window
[Main Window](https://github.com/user-attachments/assets/d4297b20-5a1d-4f49-b716-629dfb106425)


### View(Club) - Button
[View - Button](https://github.com/user-attachments/assets/3cfa4b95-254d-416a-87ca-3c6013851586)

### Edit(Club) - Button
[Edit - Button](https://github.com/user-attachments/assets/47f401b5-1161-49dd-b9b6-05154c5c9666)

### Create(Club) - Button
[Create - Button](https://github.com/user-attachments/assets/6f333da5-ca56-4fc7-ac25-fe08d71ffc68)

### View(Event) - Button
[View - Button](https://github.com/user-attachments/assets/348ca919-b25b-4be4-a5de-2aae1dd751b2)

### Edit(Event) - Button
[Edit - Button](https://github.com/user-attachments/assets/92f0cb28-9f79-4aef-a69e-be4e5321a8a2)

### Create(Event) - Button
[Create - Button](https://github.com/user-attachments/assets/81d0a17f-1b76-46be-9d67-3799d086374a)

---
## Technologies Used

### Frameworks:
- Spring Boot (Spring MVC, Spring Data JPA, Spring Validation)

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
|   |   |-- java/com/rungroup/web/dto
|   |   |-- java/com/rungroup/web/models
|   |   |-- java/com/rungroup/web/service
|   |   |-- java/com/rungroup/web/repository
|   |   |-- resources/templates
|   |       |-- clubs-list.html
|   |       |-- clubs-create.html
|   |       |-- clubs-detail.html
|   |       |-- clubs-edit.html
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

5. Access the application in your web browser at:
   [http://localhost:8080](http://localhost:8090)

---
## Usage

### Running Clubs
- **List Clubs:** Access `/clubs` to see a list of all running clubs.
- **Create Club:** Navigate to `/clubs/new` to add a new running club.
- **Edit Club:** Visit `/clubs/{clubId}/edit` to modify a club’s details.
- **Delete Club:** Use the delete link on a club’s details page.

### Events
- **List Events:** Access `/events` to see all events.
- **Create Event:** Navigate to `/events/{clubId}/new` to add an event to a specific club.
- **Edit Event:** Visit `/events/{eventId}/edit` to modify an event’s details.
- **Delete Event:** Use the delete link on an event’s details page.

---
## API Endpoints

### Club Endpoints

| Method | Endpoint              | Description                  |
|--------|-----------------------|------------------------------|
| GET    | `/clubs`              | List all clubs               |
| GET    | `/clubs/{clubId}`     | View club details            |
| GET    | `/clubs/new`          | Form for creating a new club |
| POST   | `/clubs/new`          | Save a new club              |
| GET    | `/clubs/{clubId}/edit`| Form for editing a club      |
| POST   | `/clubs/{clubId}/edit`| Update a club                |
| GET    | `/clubs/{clubId}/delete`| Delete a club              |
| GET    | `/clubs/search`       | Search for clubs             |

### Event Endpoints

| Method | Endpoint               | Description                  |
|--------|------------------------|------------------------------|
| GET    | `/events`              | List all events              |
| GET    | `/events/{eventId}`    | View event details           |
| GET    | `/events/{clubId}/new` | Form for creating a new event|
| POST   | `/events/{clubId}`     | Save a new event             |
| GET    | `/events/{eventId}/edit`| Form for editing an event   |
| POST   | `/events/{eventId}/edit`| Update an event             |
| GET    | `/events/{eventId}/delete`| Delete an event           |

---
## Thymeleaf Templates

The project uses Thymeleaf for dynamic HTML content generation. Key templates include:

- **clubs-list.html** - Displays a list of clubs with a search form.
- **clubs-create.html** - Form for creating a new club.
- **clubs-detail.html** - Details of a specific club and associated events.
- **clubs-edit.html** - Form for editing a club.



