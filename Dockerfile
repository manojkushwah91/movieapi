FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

# 🔑 FIX PERMISSION ISSUE
RUN chmod +x mvnw

# Build the Spring Boot app
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/movieapi-0.0.1-SNAPSHOT.jar"]