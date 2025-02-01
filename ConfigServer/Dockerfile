FROM openjdk:17-alpine

EXPOSE 9296

ADD target/config-server.jar config-server.jar

ENTRYPOINT ["java", "-jar", "config-server.jar"]