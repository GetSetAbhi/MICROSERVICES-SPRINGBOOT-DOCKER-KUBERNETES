FROM openjdk:17-alpine

EXPOSE 8080

ENV EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka

ADD target/product-service.jar product-service.jar

ENTRYPOINT ["java", "-jar", "product-service.jar"]