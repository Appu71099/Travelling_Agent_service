# Use Eclipse Temurin Java 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Expose port 8080 (optional but good practice)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
