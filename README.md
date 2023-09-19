# System EAD Microservice Course
![image](https://github.com/DgSantos017/sistema-ead-microservice-course/assets/62971277/5d823f2b-1aec-4505-84ef-d0c3b7ffa67a)

### baseUrl -> http://localhost:8082/

# How to Run?
- Fork and clone this repository
- Download dependencies; if using IntelliJ, you can trigger Maven to handle this process automatically
- Replace the database credentials (PostgreSQL) in the ``application.yml`` file with your local machine's credentials
- From the ``CourseApplication`` file, execute the project; if everything is correct, the API will run on port 8087

## Where can I access the endpoints?
I have shared a workspace in Insomnia with all the endpoints. If you would like to access it, please click on the link below:

https://github.com/DgSantos017/sistema-ead-microservice-service-registry/blob/master/requestsInsominia.json
![image](https://github.com/DgSantos017/sistema-ead-microservice-auth-user/assets/62971277/acf5333d-4fea-4a6f-9171-2c8da442039f)
When accessing this link, click on the red-highlighted download button in the screenshot above, and if you have Insomnia installed on your machine, simply import it

## !!! Attention !!!
This microservice relies on the operation of the three microservices listed below. I'll provide the links for each, and you'll find documentation similar to this in their respective readme.md files. Simply follow the provided instructions to set them up.

https://github.com/DgSantos017/sistema-ead-microservice-service-registry
https://github.com/DgSantos017/sistema-ead-microservice-api-gateway
https://github.com/DgSantos017/sistema-ead-microservice-auth-user

## Requirements to Run Locally
- Java: Version 11 or higher
- PostgreSQL

## Stacks
- Java 11
- Spring Boot 2.5.4
- Spring Data JPA
- PostgreSQL
- Spring Validation

# Tools
- Linux
- IntelliJ IDE
- Insomnia
- DBeaver

Developed by [Diogo Ferreira](https://www.linkedin.com/in/diogo-santos01/)

