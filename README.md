# springdemo
Java Spring Boot with Thymeleaf 

The app has the following end points:

localhost:8080/  - Shows the "Add User" form

localhost:8080/newuserreview   - Shows the Review screen with a confirmation button,  including a table of previous data entries

localhost:8080/insert - This end point will be used for sending the data to the db

localhost:8080/showlist - Shows the table of previous entries 

The app will create a data storage in: c:\data\appdatadb .  (h2 database)
The db path can be found in resources\application.properties

