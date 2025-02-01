FROM openjdk:17-alpine

EXPOSE 8082

ENV EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka

ADD target/order-service.jar order-service.jar

ENTRYPOINT ["java", "-jar", "order-service.jar"]