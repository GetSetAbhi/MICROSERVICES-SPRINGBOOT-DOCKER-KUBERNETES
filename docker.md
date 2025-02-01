# Docker instructions for this project

## General Command

1) To remove any container execute following

```
docker rmi image_name:tag
```

2) To get a list of running containers

```
docker ps
```

3) To get a list of all containers whether running or not

```
docker ps -a
```

4) To get logs of a particular running container
```
docker logs <container_id>
```

5) To stop a running container
```
docker stop <container_id>
```

6) To remove a container
```
docker rm <container_id>
```

7) To remove all containers except the active one
```
docker container prune -f
```

8) Running the docker compose file
First go inside the folder having the docker-compose file and open it in command prompt or powershell in admin mode.
Execute following command
```
docker-compose -f docker-compose.yaml up
```

## Mysql

1) Download and start mysql container

```
docker run -d --name mysql-db -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=mydb -e MYSQL_USER=myuser -e MYSQL_PASSWORD=mypassword -p 3306:3306 mysql:8

```

2) Run mysql inside docker

```
docker exec -it mysql-db mysql -u myuser -p

```

## Service Registry

To Build image for service registry

1) Go to the folder containing the Dockerfile and open command prompt or powershell in admin mode.

2) Execute

```
docker build -t serviceregistry:v1 .
```

3) To run the serviceregistry image, execute command

```
docker run -p 8761:8761 serviceregistry:v1
```
or we can run our image in detached mode

```
docker run -d -p 8761:8761 serviceregistry:v1
```

## Config - Server

To Build image for service registry

1) Go to the folder containing the Dockerfile and open command prompt or powershell in admin mode.

2) Execute

```
docker build -t configserver:v1 .
```

3) To run the serviceregistry image, execute command

```
docker run -p 9296:9296 configserver:v1
```
or we can run our image in detached mode

```
docker run -d -p 9296:9296 configserver:v1
```
