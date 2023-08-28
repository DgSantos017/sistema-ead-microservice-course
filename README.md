# System EAD Microservice Course
![image](https://github.com/DgSantos017/sistema-ead-microservice-course/assets/62971277/5d823f2b-1aec-4505-84ef-d0c3b7ffa67a)

### baseUrl -> http://localhost:8082/

# API Rest Features
## Course -> courses/
- saveCourse 
- getAllCourses 
- getOneCourse -> courseId
- updateCourse -> courseId
- deleteCourse -> courseId
  
## Module -> modules/
- saveModule -> course/courseId 
- getAllModules -> course/courseId 
- getOneModule -> course/courseId/module/moduleId
- updateModule -> course/courseId/module/moduleId
- deleteModule -> course/courseId/module/moduleId

## Lesson -> lessons/
- saveLesson -> module/moduleId 
- getAllLessons -> module/moduleId
- getOneLesson -> lessonId/module/moduleId
- updateLesson -> lessonId/module/moduleId
- deleteLesson -> lessonId/module/moduleId

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

# How to Run?
- Fork and clone this repository
- Download dependencies; if using IntelliJ, you can trigger Maven to handle this process automatically
- Replace the database credentials (PostgreSQL) in the ``application.yml`` file with your local machine's credentials
- From the ``AuthuserApplication`` file, execute the project; if everything is correct, the API will run on port 8087
- Refer to the endpoints for accessing the resources in the ``requestsInsomnia.json`` file located at the root of this repository

Developed by [Diogo Ferreira](https://www.linkedin.com/in/diogo-santos01/)
