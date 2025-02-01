FROM openjdk:17-alpine

EXPOSE 8080

ADD target/product-service.jar product-service.jar

ENTRYPOINT ["java", "-jar", "product-service.jar"]