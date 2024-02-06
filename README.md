# Mortgage Plan Calculator

This repository contains two branches: 'main' and 'optional'.

## Main Branch

The 'main' branch features a straightforward Mortgage Plan Calculator implemented in Java using Maven.
It reads customer information from a text file, calculates the monthly payment for each customer and prints the results to the console.

### Prerequisites

Make sure you have the following installed in your machine:

- Java Development Kit 21
- Maven
- Clone the project

### Getting Started

#### Build the project
1.mvn clean install

#### Run the application
2.mvn exec:java

## Optional Branch

The 'optional' branch features the Mortgage Plan Calculator implemented in Java using Maven, with the Spring Boot framework.
It reads customer information from a text file, calculates the monthly payment for each customer and prints out the result
in the web browser. Additionally, the web application provides functionality for adding new customer prospects.

### Getting Started

#### Build the project
1.mvn clean install

#### Run the application
2.mvn spring-boot:run

#### Open your web browser
3.Go to: http://localhost:8080/customers