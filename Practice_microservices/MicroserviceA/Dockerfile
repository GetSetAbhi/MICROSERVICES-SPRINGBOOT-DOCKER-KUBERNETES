FROM openjdk:17-alpine

EXPOSE 8080

ADD target/microa.jar micro-a.jar

ENTRYPOINT ["java", "-jar", "micro-a.jar"]