# BookStore Application

This is a simple BookStore web application built using **Spring Boot** for backend services and **Thymeleaf** for rendering views. The application allows users to perform basic operations related to book management, including adding, viewing, editing, and deleting books.

## Demo

[![Watch the video](https://img.youtube.com/vi/367Gy9VvPtY/hqdefault.jpg)](https://www.youtube.com/watch?v=367Gy9VvPtY)


## Features

- Register new books with name, author, and price.
- View a list of available books.
- Add books to a personal "My Books" list.
- Edit book details (name, author, price).
- Delete books from both the available list and the "My Books" list.

## Technologies Used

- **Spring Boot** for backend logic.
- **Spring Data JPA** for database interaction.
- **Thymeleaf** as the templating engine for views.
- **H2 Database** for quick and easy database setup (or you can use another database like MySQL, PostgreSQL, etc.).
- **Lombok** to reduce boilerplate code for getters, setters, constructors, etc.
- **Bootstrap** for styling the UI.

## Project Structure

```plaintext
src/
│
├── main/
│   ├── java/com/bookStore/
│   │   ├── controller/
│   │   │   ├── BookController.java
│   │   │   └── MyBookListController.java
│   │   ├── entity/
│   │   │   ├── Book.java
│   │   │   └── MyBookList.java
│   │   ├── repository/
│   │   │   ├── BookRepository.java
│   │   │   └── MyBookListRepository.java
│   │   ├── service/
│   │   │   ├── BookService.java
│   │   │   └── MyBookListService.java
|   |   ├── BookStoreApplication 
│   └── resources/
│       ├── templates/
│       │   ├── index.html
│       │   ├── bookRegister.html
│       │   ├── bookList.html
│       │   ├── myBooks.html
│       └── application.properties
└── test/
```

## Setup and Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/BookStore.git
cd BookStore

```
2. Set up the database: The project is configured to use an in-memory H2 database by default. If you wish to switch to another database (e.g., MySQL), configure the database connection in

```bash 
src/main/resources/application.properties                       
```
3. Build the project and run:

```bash 
mvn clean install
mvn spring-boot:run
```
The application will start on http://localhost:8080.


