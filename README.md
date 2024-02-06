# Mortgage Plan Calculator

This repository contains two branches: 'main' and 'optional'.

## Main Branch

The 'main' branch features a straightforward Mortgage Plan Calculator implemented in Java using Maven.
It reads customer information from a text file, calculates the monthly payment for each customer and prints the results to the console.

### Prerequisites

Make sure you have the following installed on your machine:

- Java Development Kit 21
- Maven
- Clone the project

### Getting Started
Note: You need to be in the same directory as the project folder
#### Build the project
1.mvn clean install

#### Run the application
2.mvn exec:java

## Optional Branch

The 'optional' branch features the Mortgage Plan Calculator implemented in Java using Maven, with the Spring Boot framework.
It reads customer information from a text file, calculates the monthly payment for each customer and prints out the result
in the web browser. Additionally, the web application provides functionality for adding new customer prospects.

### Getting Started
Note: You need to be in the same directory as the project folder
## Alternative 1

#### Build the project
1.mvn clean install

#### Run the application
2.mvn spring-boot:run

#### Open your web browser
3.Go to: http://localhost:8080

## Alternative 2

#### Build the project
1.mvn clean install

#### Build Docker image
Note: You need to be in the same directory as the Dockerfile
Build the Docker image and give it a name e.g., mortgageplan-image

2.docker build -t mortgageplan-image .

#### Run the Docker image
3.docker run -p 8080:8080 mortgageplan-image

#### Open your web browser
4.Go to: http://localhost:8080