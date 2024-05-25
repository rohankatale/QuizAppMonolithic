# Quiz Application

This is a monolithic Quiz Application built with Spring Boot. The application allows users to attempt questions from specific categories, view their scores, see all available questions, and create new questions. It covers all CRUD operations and provides additional features to enhance the quiz-taking experience.

## Features

- **Attempt Questions**: Users can attempt quiz questions from different categories.
- **View Scores**: Users can see their scores after completing the quiz.
- **Manage Questions**: Users can view all questions, create new questions, update existing questions, and delete questions.

## Technologies Used

- **Spring Boot**: Backend framework for building the application.
- **Spring Data JPA**: For database interactions.
- **H2 Database**: In-memory database for development and testing.
- **Maven**: Dependency management.

## Monolithic Architecture

This application follows a monolithic architecture, where all components of the application are contained within a single codebase. This structure is beneficial for small to medium-sized applications due to its simplicity in development, testing, and deployment processes.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

**Clone the repository**

   ```bash
   git clone https://github.com/yourusername/quizapplication.git
   cd quizapplication
   ```
## API Functionality

This application provides a comprehensive set of API endpoints covering all CRUD operations:

- **Create**: Add new quiz questions.
- **Read**: Retrieve questions, including by specific categories.
- **Update**: Modify existing questions.
- **Delete**: Remove questions.

### Additional Features

Users can also attempt quizzes and view their scores.

```bash
quizapplication/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── yourusername/
│   │   │           └── quizapplication/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
│       └── java/
│           └── com/
│               └── yourusername/
│                   └── quizapplication/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md

├── mvnw.cmd
├── pom.xml
└── README.md


