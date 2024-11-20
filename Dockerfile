# Use official jdk as a parent image
FROM openjdk:20-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the built application JAr file from your local machine to the container
COPY target/ProjectExercise-0.0.1-SNAPSHOT.jar /app

# Make port 8080 availible to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "ProjectExercise-0.0.1-SNAPSHOT.jar"]