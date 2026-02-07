# 🎬 Movie Management REST API

A simple and professional **Java Spring Boot RESTful backend application** for managing a collection of movies.  
This project is developed **strictly according to the given sample task**, using **in-memory data storage** and clean REST API design.

---

## 📌 Problem Statement (Task Summary)

Create a Java backend application that:
- Manages a collection of items (Movies)
- Uses **in-memory storage (ArrayList)**
- Provides REST APIs to:
  - Add an item
  - Get an item by ID
- Validates input data
- Includes proper documentation
- Is hosted online for demo purposes

---

## 🌐 Live Demo

🔗 **Deployed Application URL:**  
https://movieapi-ar5j.onrender.com/api/movies

> ⚠️ **Important Note:**  
> This application is hosted on **Render (Free Tier)**.  
> The first request may take **30–50 seconds** due to server cold start.

---

## 🚀 Features

- **RESTful API Design**
- **In-Memory Data Storage** using `ArrayList`
- **Input Validation** using `jakarta.validation`
- **Clean Layered Architecture**
- **No Database Used** (as required)
- **Production-ready structure for demo**

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Jakarta Validation
- Maven
- Docker
- Render (Hosting)

---

## 📑 API Endpoints

### 1️⃣ Add a Movie
**Method:** `POST`  
**Endpoint:** `/movies`

**Description:**  
Adds a new movie to the in-memory collection.

**Sample Request Body:**
```json
{
  "title": "The Dark Knight",
  "genre": "Action",
  "year": 2008
}
