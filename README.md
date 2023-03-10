#  <img height="50" src="https://thumbs.dreamstime.com/b/vector-flat-taxi-logo-isolated-white-background-car-face-icon-silhouette-auto-template-service-brand-design-78247442.jpg" width="50"/> _My-Own-Taxi-Service_ <img height="50" src="https://thumbs.dreamstime.com/b/vector-flat-taxi-logo-isolated-white-background-car-face-icon-silhouette-auto-template-service-brand-design-78247442.jpg" width="50"/>


<img height="15" src="https://banner2.cleanpng.com/20190406/yh/kisspng-vector-graphics-illustration-stock-photography-com-science-amp-engineering-practices-in-danielson-n-5ca963ff908b01.2932726015546050555921.jpg" width="15"/> Description:

This is a simple application that allows you to work with a taxi service. 
This app follows SOLID principles and based on N-tier architecture. 
It supports registration, authentication, and all CRUD-based operations. 

<img height="15" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqx3EHXGXda4ozUKrhS7CIPPQ0_BO9iydkUuzxQGlx4hajdqW9FoQB5QdpchDCNipFPYw&amp;usqp=CAU" width="15"/> Project structure:

- Data access tier -> handled by DAO;
- Business logic tier -> handled by Service;
- Presentation tier -> handled by Controllers and JSP pages.

<img height="15" src="https://edps.europa.eu/sites/default/files/picture/technologies2.png" width="18"/> Technologies used:

   - Java for service (I'm using version 17.0.3.1)
   - IntelliJ IDEA (I'm using IntelliJ IDEA 2021.2.2 Ultimate Edition)
   - Maven for service (I'm using version 3.8.6)
   - JDBC for connection to DB
   - MySQL as database (I'm using version 8.0.22)
   - Apache Tomcat as web server (I'm using version 9.0.50)
   - JSP for presentation
   - Java Servlet API for presentation (I'm using version 4.0.1)
   - JSTL for presentation
   

<img height="15" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXQZfgbHHUnh8EnFosVBvL1Q9zxQAuNrlmEzCQBAGzc7VihcwrsyRzGRBuvseJz4P-0OM&amp;usqp=CAU" width="15"/> How to launch the project on your PC:

 - Fork this repo
 - Create schema and all tables using the file init_db.sql
 - Config ConnectionUtil.class(you need write your own data in these constants)
   - private static final String URL = "URL";
   - private static final String USERNAME = "USERNAME";
   - private static final String PASSWORD = "PASSWORD";
   - private static final String JDBC_DRIVER = "JDBC_DRIVER";
 - Install Tomcat. I am using Tomcat 9.0.50.
 - Add Tomcat server to configuration
 - Run project


<img height="15" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKh-Dn0GSB6fdKRIxtn6Y0biCS9AoCnOoicg&amp;usqp=CAU" width="12"/> DataBase structure:

![img_19.png](img_19.png)

<img height="15" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3-ICSVzVaMt1ov__DHsq6uhOcSBY3EiXq7Q&amp;usqp=CAU" width="15"/> Functionalities:


 - Login
 - Register a driver
 - Add a driver (i.e. register driver via the form or just add a new one if you are login)
 - Add a car
 - Add a manufacturer
 - Add a driver to a car
 - Display all current drivers cars
 - Display all cars
 - Display all drivers
 - Display all manufacturers
 - Soft delete a car
 - Soft delete a manufacturer
 - Soft delete a driver
 - Logout

![img.png](img.png)


