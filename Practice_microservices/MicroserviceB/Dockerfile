FROM openjdk:17-alpine

EXPOSE 8081

ENV MICROSERVICE_A_URL=http://micro-a:8080/a/hello

ADD target/microb.jar micro-b.jar

ENTRYPOINT ["java", "-jar", "micro-b.jar"]