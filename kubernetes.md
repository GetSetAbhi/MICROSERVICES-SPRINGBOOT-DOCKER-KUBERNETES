# Kubernetes instructions for this project

## General Command

1) To create a namespace

```
kubectl create namespace <namespace_name>
```

2) To get details of all namespaces

```
kubectl get all --all-namespaces
```

3) To get details of a particular namespace

```
kubectl get all -n <namespace-name>
```

4) To delete a namespace
```
kubectl delete namespace <namespace-name>
```

5) To execute deployment and service config files inside a folder execute
```
kubectl apply -f .\k8\
```

6) You can check status of all deployments in minikube dashboard
```
minikube dashboard
```

7) To expose a service and access it locally, perform following
	a) First get list of services running
		```
		kubectl get services
		```
	b) use minikube command to expose it
		```
		minikube service <service_name>
		```
		
		we expose product service to utilize the Product service API