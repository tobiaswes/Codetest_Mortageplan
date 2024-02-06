FROM openjdk:21

WORKDIR /app

COPY target/mortgageplan.jar /app/mortgageplan.jar

EXPOSE 8080

CMD ["java", "-jar", "mortgageplan.jar"]

