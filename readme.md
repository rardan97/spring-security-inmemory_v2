## Spring Security - In Memory Authentication V2

## System Requirements

- Java openjdk : ( version "17.0.2")
- Spring Boot : (version 3.3.3)
- Maven : (Apache Maven 3.9.3)
- Editor : (Intellij IDEA 2023.1.1 Community Edition)

## Dependencis

- Spring Web
- Spring Security

## Run Project

1. clone project Spring boot
```
https://github.com/rardan97/spring-security-inmemory_v2.git
```

4. open terminal input command
```
mvn clean install 
```
5. if success, next input command
```
mvn spring-boot:run
```

## Testing project
using application browser or postman for testing

1. Testing Role USER

In this testing using ROLE USER for access endpoint user http://localhost:8080/getUser
![1.png](image%2F1.png)

In this testing using ROLE USER for access endpoint admin http://localhost:8080/getAdmin, this get Error status 403 Forbidden access
![2.png](image%2F2.png)


1. Testing Role ADMIN

In this testing using ROLE ADMIN for access endpoint admin http://localhost:8080/getAdmin

![3.png](image%2F3.png)

In this testing using ROLE ADMIN for access endpoint user http://localhost:8080/getUser, this get Error status 403 Forbidden access
![4.png](image%2F4.png)