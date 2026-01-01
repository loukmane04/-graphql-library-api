FROM eclipse-temurin:21-jdk AS build

WORKDIR /workspace/app

# Copy the entire demo directory
COPY demo/demo/ .

# Build the application
RUN ./mvnw clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /workspace/app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]