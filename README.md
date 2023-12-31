# Cinema app

Web-app which supports basic functionality for cinema operation, designed for companies that operate cinema with a few cinema halls. It has functionality for both administration staff and regular customers/users. From the administration side, it can add/delete/alter cinema halls, movies, and movie sessions, etc. As for customer side, it supports authentication, registration, orders history, and shopping cart for buying tickets.

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

- Spring ORM
- Spring MVC
- Spring Security
- Hibernate
- Hibernate validator
- Servlet API
- MySQL connector
- Javax annotation API
- Maven compiler plugin
- Maven WAR plugin
- Jackson Databind
- Jackson Datatype
- Apache Tomcat
- Intellij Idea Ultimate

### How to deploy the project:

Pre-requirements: 
- Intellij Idea Ultimate installed
- Tomcat Server installed
- MySQL installed
- Postman for sending HTTP requests installed

1) Create new project from version control using the SSH link

2) Please, connect the project to your DB using db.properties file in the IDE. Insert your connection details instead of the following fields:
   
    
    db.driver=YOUR DRIVER 

    db.url=YOUR URL
   
    db.user=YOUR USERNAME

    db.password=YOUR PASSWORD

    The  mysql-connector-java version used for the project development is 8.0.22

3) Tune Tomcat local server to run the app. In Intellij idea Ultimate, create new configuration using Tomcat Server -> Local

Please keep all the parameters unchanged

Click Fix button and select cinema-app: war exploded -> apply -> OK

        The  Tomcat version used for the project development is 9.0.73


4) Run the project using your new configuration. The login page should be opened automatically in your browser. In addition, you should receive a Tomcat server running confirmation in the terminal of IDE.


5) Send relevant http requests from local Postman app to test the app functionality.
    