# Docker instructions for this project


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



## Product - Service
