# ---------- Stage 1: Build ----------
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build

WORKDIR /app

# Copy Maven files first for dependency caching
COPY pom.xml .
COPY src ./src

# Build the JAR
RUN mvn clean install -DskipTests

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
