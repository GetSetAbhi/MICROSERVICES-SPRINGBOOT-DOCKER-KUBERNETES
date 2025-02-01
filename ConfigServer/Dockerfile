FROM openjdk:17-alpine

EXPOSE 9296

ENV EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka

ADD target/config-server.jar config-server.jar

ENTRYPOINT ["java", "-jar", "config-server.jar"]