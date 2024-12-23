# RunGroup

# UI Overview for Event Management Application

## **General Structure**
- **Layout:** The `layout.html` file serves as a shared template for all pages. It includes a header, navigation bar, and footer, styled with Bootstrap for a responsive and polished look.
- **Navigation Bar:**
  - Links: Home, Find Clubs, Find Events, and Directory.
  - User Actions Dropdown: Options to create a running club, log in, register, and log out.
- **Dynamic Content:** Thymeleaf templates (`th:replace`) dynamically inject page-specific content into the base layout.

---

## **Page Details**

### 1. **Events Create (`events-create.html`)**
- **Purpose:** Provides a form for users to create new events.
- **Features:**
  - A user-friendly form with fields for:
    - **Name:** Text input for the event name.
    - **Type:** Text input for the type of event (e.g., Road Race, Marathon).
    - **Photo URL:** Text input to link an image for the event.
    - **Start Time:** Date-time picker for the event start.
    - **End Time:** Date-time picker for the event end.
  - **Error Messages:** Displayed near relevant fields for validation issues.
  - **Submit Button:** Styled using Bootstrap for consistency.
  - Form is functional and integrates with backend validation and persistence.

---

### 2. **Events Detail (`events-detail.html`)**
- **Purpose:** Displays all information about a specific event.
- **Features:**
  - **Header Section:**
    - Event name displayed prominently.
    - Event location (e.g., "Charlotte, NC").
  - **Details Section:**
    - **Event Photo:** A large image representing the event.
    - **Event Type:** The category/type of the event.
    - **Creation Date:** When the event was created.
    - **Delete Button:** Allows users to remove the event permanently.
  - **Sidebar Widgets:**
    - **Search Widget:** Input field for keyword searches.
    - **Categories Widget:** Links to predefined categories (e.g., Road Runner, Trail).
    - **Side Widget:** Placeholder content for promotions, announcements, or additional links.

---

### 3. **Events Edit (`events-edit.html`)**
- **Purpose:** Enables users to modify an existing event.
- **Features:**
  - A pre-populated form, similar to `events-create.html`, allowing users to edit:
    - Name
    - Type
    - Photo URL
    - Start Time
    - End Time
  - **Error Messages:** Displayed for invalid fields to guide corrections.
  - **Submit Button:** Styled consistently across the application.

---

### 4. **Events List (`events-list.html`)**
- **Purpose:** Displays all available events in a grid format.
- **Features:**
  - **Event Cards:** Each event displays:
    - A photo.
    - The event name (linked to the event details page).
    - Action buttons:
      - **View:** Navigates to the event details.
      - **Edit:** Opens the event editing form.
  - **Dynamic Listing:** Powered by Thymeleaf’s `th:each`, which iterates through the backend-provided list of events.
  - **Responsive Design:** Ensures cards adjust layout seamlessly across devices.

---

### 5. **Layout (`layout.html`)**
- **Purpose:** Defines the overall structure and reusable UI components for the application.
- **Features:**
  - **Header & Navigation Bar:**
    - Consistent across all pages.
    - Links: Home, Find Clubs, Find Events, and Directory.
    - User dropdown menu for:
      - Creating a running club.
      - Logging in or out.
      - Registering a new account.
  - **Footer:**
    - Includes links for Privacy, Terms, and Contact.
    - Copyright notice for branding.
  - **Dynamic Content Placeholder:** Uses `layout:fragment="body"` to embed page-specific content dynamically.

---

## **Common UI Features**
- **Styling & Responsiveness:** 
  - Bootstrap is used throughout for a consistent, modern, and mobile-friendly design.
- **Dynamic Data Injection:** Thymeleaf seamlessly integrates server-side data with front-end templates.
- **Error Handling:**
  - Inline validation messages for form fields.
  - Meaningful error indicators and prompts to improve the user experience.
- **Search & Filters:**
  - Sidebar widgets in detail pages allow users to search for events or filter them by categories.

---

## **Unique Features Highlighted from the First Message**
1. **Form Validation Feedback:** 
   - In `events-create.html` and `events-edit.html`, validation errors are displayed inline, ensuring users can address issues effectively.
2. **Efficient Layout Reuse:**
   - The `layout.html` file uses Thymeleaf’s `th:replace` and `th:block` to minimize code duplication.
3. **Dynamic Content Loading:**
   - Events are displayed dynamically using Thymeleaf `th:each` in list pages.
4. **Edit and Delete Actions:**
   - Direct action buttons (edit/delete) enhance usability by enabling quick modifications.
5. **Category Navigation:**
   - The categories widget on the sidebar provides links to predefined event types, enhancing discoverability.

---

Let me know if you need additional details or edits!


