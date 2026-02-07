# Movie Management REST API

This is a simple Java Spring Boot backend application that implements a RESTful API for managing a collection of movies.  
The application uses an in-memory data store (ArrayList) and demonstrates basic REST operations.

---

## 🚀 Features

- Add a new movie
- Get a movie by ID
- Input validation using Jakarta Validation
- In-memory storage (no database)

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Maven

---

## 📦 API Endpoints

### ➕ Add a Movie
**POST** `/movies`

Request Body:
```json
{
  "id": 1,
  "name": "Inception",
  "description": "Sci-fi thriller movie"
}