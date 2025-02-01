# MICROSERVICES-SPRINGBOOT-DOCKER-KUBERNETES


## application.yml
 
application.yml is the place for storing config properties.
This repository acts as the config repository itself so any properties 
that have to be passed on to the microservices are added to the application.yml


Use the Following Endpoints and payloads to work with the microservices.

**Make sure mysql is installed.**


## Product - Service

1) Create Product 

POST http://localhost:8080/product

```json
{
    "name": "Apple",
    "price": 10,
    "quantity": 1
}
```

2) Get Product by id 

GET http://localhost:8080/product/1
```json
{
    "name": "Apple",
    "price": 10,
    "quantity": 1
}
```

## Order - Service

1) Create Order

POST http://localhost:8082/order/placeOrder
```json
{
    "productId": 1,
    "totalAmount": 100,
    "quantity": 1,
    "paymentMode": "CASH"
}
```