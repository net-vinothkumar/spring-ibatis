# Spring Boot + MyBatis + H2 Database Demo:


# What is MyBatis ? Why do we need MyBatis ?

MyBatis is a persistence framework / ORM with support for custom SQL, stored procedures and advanced mappings.
MyBatis helps to map the domain objects to database table data.
MyBatis eliminates almost all of the JDBC code and manual setting of parameters and retrieval of results.
It provides simple XML or Annotation based configuration to map Java POJOs to database.


<img width="970" alt="screen shot 2018-05-19 at 21 15 20" src="https://user-images.githubusercontent.com/30971809/40272172-d8eb330a-5ba9-11e8-9a56-f0374d379088.png">


# Details about the demo project :

Mobile.java - The bean/pojo to store mobile details.
MobileMyBatisRepository.java - CRUD, Contains all the methods to store and retrieve mobile details to the H2 database.
schema.sql - Since we are using an in memory database, we define the tables as part of our application code in this file.
data.sql - We use data.sql to populate the initial mobile data.

# How to start the spring boot application ?

SpringBootMyBatisApplication - start the main application

# How to access the H2 Database ?

Once the Spring Boot server started ,then access the H2 database URL - the http://localhost:8080/h2-console.

# Output :

Mobile id 10001 -> Mobile{name='iPhone', model='X8', price=100000}
2018-05-19 21:03:04.844  INFO 1453 --- [  restartedMain] ication$$EnhancerBySpringCGLIB$$a0590b83 : Inserting -> 1
2018-05-19 21:03:04.845  INFO 1453 --- [  restartedMain] ication$$EnhancerBySpringCGLIB$$a0590b83 : Update 10003 -> 1
2018-05-19 21:03:04.852  INFO 1453 --- [  restartedMain] ication$$EnhancerBySpringCGLIB$$a0590b83 : All users -> [Mobile{name='Apple iPhone X', model='X8', price=120000}, Mobile{name='Samsung', model='S8', price=70000}, Mobile{name='Apple iPhone', model='X7', price=100000}]


