# RunGroup

# UI Overview for Event Management Application

## **General Structure**
- **Layout:** The `layout.html` file serves as a common template for all pages. It includes a header, navigation bar, and footer, styled using Bootstrap for responsiveness and a modern look.
- **Navigation Bar:**
  - Links: Home, Find Clubs, Find Events, and Directory.
  - User Actions Dropdown: Options for creating a running club, login, register, and logout.

---

## **Page Details**

### 1. **Events Create (`events-create.html`):**
- **Purpose:** Allows users to create new events.
- **Features:**
  - A form with the following fields:
    - **Name:** Text input for the event name.
    - **Type:** Text input for the event type.
    - **Photo URL:** Text input for an image link.
    - **Start Time:** Date-time picker for start time.
    - **End Time:** Date-time picker for end time.
  - Form validation with error messages displayed near the corresponding field.
  - Submit button styled with Bootstrap.

---

### 2. **Events Detail (`events-detail.html`):**
- **Purpose:** Displays detailed information about a specific event.
- **Features:**
  - **Header Section:** Event name and location (e.g., "Charlotte, NC").
  - **Details Section:**
    - Event photo.
    - Event type.
    - Creation date.
    - "Delete" button to remove the event.
  - **Sidebar Widgets:**
    - **Search Widget:** Input field for search terms.
    - **Categories Widget:** Links to different event categories (e.g., Road Runner, Trail, Marathon).
    - **Side Widget:** Placeholder for additional content.

---

### 3. **Events Edit (`events-edit.html`):**
- **Purpose:** Allows users to edit existing events.
- **Features:**
  - A pre-filled form similar to `events-create.html`.
  - Fields include:
    - Name
    - Type
    - Photo URL
    - Start Time
    - End Time
  - Validation error messages near relevant fields.
  - Submit button styled with Bootstrap.

---

### 4. **Events List (`events-list.html`):**
- **Purpose:** Displays a grid of events.
- **Features:**
  - **Event Cards:** Each event displays:
    - A photo.
    - Event name (linked).
    - Action buttons:
      - **View:** Navigate to the event detail page.
      - **Edit:** Navigate to the event edit page.
  - **Dynamic Content:** Thymeleaf’s `th:each` dynamically loops through the list of events to populate the grid.

---

### 5. **Layout (`layout.html`):**
- **Purpose:** Defines the reusable structure for all pages.
- **Features:**
  - **Navigation Bar:**
    - Links: Home, Find Clubs, Find Events, and Directory.
    - User dropdown with links for creating a running club, login, register, and logout.
  - **Footer:**
    - Copyright information.
    - Links: Privacy, Terms, and Contact.
  - Placeholder for dynamic page content (`layout:fragment="body"`).

---

## **UI Features**
- **Styling:** Bootstrap ensures consistency, modern styling, and responsiveness.
- **Dynamic Content:** Thymeleaf injects data (events, clubs, etc.) into HTML templates dynamically.
- **Error Handling:** Form validation with error messages displayed near the relevant fields.
- **Actions:** Users can create, view, edit, or delete events via intuitive buttons and links.
- **Search and Categories:** Sidebar widgets enhance browsing and filtering options.

---

Let me know if you'd like assistance with further modifications or testing!
