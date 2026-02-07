Movie Management API
A lightweight, RESTful Java backend application built with Spring Boot to manage a collection of movies. This project demonstrates clean code practices, input validation, and in-memory data management as per the technical assessment requirements.

🚀 Live Demo
The application is hosted on Render and can be accessed here: https://movieapi-ar5j.onrender.com/api/movies

Note: Since this is hosted on a free tier, the service may take 30–60 seconds to "wake up" during the first request if it has been inactive.

🛠️ Tech Stack
Language: Java 17

Framework: Spring Boot 3.x

Build Tool: Maven

Data Storage: In-Memory (ArrayList)

Deployment: Docker & Render

📌 API Endpoints
1. Add a New Movie
Method: POST

Path: /api/movies

Sample Request Body:

JSON
{
  "title": "Interstellar",
  "genre": "Sci-Fi",
  "releaseYear": 2014
}
Validation: The title and genre fields are required. If missing, the API returns a 400 Bad Request.

2. Get a Single Movie by ID
Method: GET

Path: /api/movies/{id}

Response: Returns the movie details or a 404 Not Found if the ID does not exist.

3. Get All Movies
Method: GET

Path: /api/movies

⚙️ Implementation Details
In-Memory Store: As requested, an ArrayList is utilized within a dedicated Repository layer to manage the data lifecycle.

Input Validation: Implemented using jakarta.validation constraints to ensure only valid data is stored.

Architecture: The project follows a clean Controller-Service-Repository pattern to ensure separation of concerns.

🏃 How to Run Locally
Clone the repository:

Bash
git clone https://github.com/manojkushwah91/movieapi
Navigate to the project directory:

Bash
cd movieapi
Run the application:

Bash
./mvnw spring-boot:run
Access the API: The server will start at http://localhost:10000/api/movies