# DemoMVC Application

## Overview
The **DemoMVC** project is a simple Spring Boot application that demonstrates the implementation of an MVC (Model-View-Controller) architecture using Spring Framework. This application handles basic user input via a form and renders responses using JSP views.

## Features
1. **Spring Boot MVC**: Implements a simple MVC framework using Spring Boot.
2. **JSP Integration**: Uses JSP (Java Server Pages) for rendering views.
3. **Form Handling**: Demonstrates form submission and data binding using the `@ModelAttribute` annotation.
4. **Dynamic Messages**: Displays user-specific messages after form submission.

## Tools and Technologies
- **Java 17**: The application is developed using Java 17.
- **Spring Boot 3.4.0**: Provides an embedded server and simplifies dependency management.
- **Maven**: Dependency management and build tool.
- **Tomcat Jasper**: Used for JSP compilation and rendering.
- **JSP (Java Server Pages)**: For the dynamic rendering of views.
- **Spring Boot Starter Web**: Enables web application development.

## Application Workflow
1. **Home Page**:
   - URL: `/`
   - Displays a welcome message.
   - Provides a link to navigate to the user form.

2. **User Form**:
   - URL: `/userForm`
   - Presents a simple form for user input (name and email).
   - Uses Spring's `@ModelAttribute` for automatic data binding to a `User` object.

3. **Form Submission**:
   - URL: `/submitUser`
   - Handles form submission using `@PostMapping`.
   - Displays a success message after the user submits their details.

## Project Structure
- **Controller**:
  - Contains `HomeController` for handling HTTP requests and routing between views.
- **Entity**:
  - Defines the `User` entity for form data binding.
- **Views**:
  - **Home.jsp**: Displays the welcome message and provides a link to the user form.
  - **UserForm.jsp**: Renders the user input form and handles data submission.

## How to Run
1. Clone the project or download the source code.
2. Open the project in an IDE like Eclipse or IntelliJ.
3. Ensure Java 17 and Maven are installed on your system.
4. Build the project using the Maven command:
   ```bash
   mvn clean install
   ```
5. Run the application using the `MvcApplication` class:
   ```bash
   mvn spring-boot:run
   ```
6. Access the application in a browser at `http://localhost:8080`.

## Additional Notes
- Make sure the JSP files are placed in the `src/main/webapp/WEB-INF/views` directory.
- The application includes basic form validation and data binding but can be extended for advanced features such as database integration or API development.

## Conclusion
The **DemoMVC** project serves as a starting point for learning and implementing Spring Boot MVC applications. It showcases how to use annotations like `@Controller`, `@ModelAttribute`, and `@PostMapping` effectively and integrate JSP for rendering views.
