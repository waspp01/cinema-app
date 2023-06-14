# Cinema app

Web-app which supports basic functionality for cinema operation. 

### Key features:

- Registration and authorisation as user
- Administration functionality such as creating/deleting cinemas, cinema halls, movie sessions, etc
- Users can add tickets to their shopping cart and then complete their order
- Users can view their order history
- Users can search for movie sessions by date
- Other CRUD functionality


### Project structure

The project consists of following packets:

- config - classes for the Spring framework configuration. Datainitializer class injects the first two entities to the DB
- controller - classes that represent controllers for REST functionality
- dao - classes for creating data access objects to execute CRUD operations with the DB
- dto - classes for creating data transfer objects
- exception - custom exception for the DAO layer
- lib - email and password validation functionality
- model - classes that represent key entities such as User, Movie session, etc.
- security - CustomUserDetailsService class for creating the UserDetails object for Spring to operate
- service - classes that implement business logic + mappers for creating DTO objects
- util - DateTime pattern

### Technologies used:

- Spring ORM, Spring MVC, Spring Security
- Hibernate
- Servlet API

### How to deploy the project:

1) Please, connect the project to your DB using db.properties file
2) Tune Tomcat local server to run the app.  
3) Send http requests from Postman
    