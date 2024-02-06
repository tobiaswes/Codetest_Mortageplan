FROM openjdk:21
WORKDIR app
ADD target/mortgageplan.jar mortgageplan.jar
ENTRYPOINT ["java", "-jar","mortgageplan.jar"]
EXPOSE 8080
