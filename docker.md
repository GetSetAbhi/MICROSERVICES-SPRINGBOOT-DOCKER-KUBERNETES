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

3) To get logs of a particular running container
```
	docker logs <container_id>
```

## Mysql


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

4) If we want to stop the container running service registry application 
then first we execute docker ps to get list of running containers, then we execute docker stop command to stop a running container 
```
docker ps

docker stop <container_id>
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
