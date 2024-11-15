# Stage 1: Build the application
FROM maven:3.8.8-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /home/app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code and build the application
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final image with the built JAR
FROM eclipse-temurin:17-jre

# Set the environment variable for the JAR file location
ARG PROJECT_NAME=books_db
ENV JAR_FILE=/usr/local/lib/${PROJECT_NAME}.jar

# Copy the JAR file from the build stage
COPY --from=build /home/app/target/*.jar $JAR_FILE

# Expose the port
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/usr/local/lib/books_db.jar"]