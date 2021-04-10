# SimpleWebApp
 
 <!-- PROJECT SHIELDS -->
 <!--
 *** I'm using markdown "reference style" links for readability.
 *** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
 *** See the bottom of this document for the declaration of the reference variables
 *** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
 *** https://www.markdownguide.org/basic-syntax/#reference-style-links
 -->

 [![LinkedIn][linkedin-shield]][linkedin-url]



 <!-- PROJECT LOGO -->
 <br />

   <h3 align="center">A Simple Web Application</h3>

   <p align="center">
    A Simple Web Application
     <br />
   </p>
 </p>



 <!-- TABLE OF CONTENTS -->
 ## Table of Contents

 * [About the Program](#about-the-program)
 * [Getting Started](#getting-started)
   * [Prerequisites](#prerequisites)
   * [Installation](#installation)
 * [Usage](#usage)
 * [Example](#example)
 * [Contact](#contact)



 <!-- ABOUT THE PROGRAM -->
 ## About The Program

This program is a simple web page (in progress) built using Spring Framework following the Udemy course ["Spring Framework 5: Beginner to Guru"](https://www.udemy.com/course/spring-framework-5-beginner-to-guru/).

The program is an exercise and demonstration of the Spring MVC architecural pattern.  
The general Model View Controller pattern is found at [MVC at Tutorialspoint.com](https://www.tutorialspoint.com/mvc_framework/mvc_framework_introduction.htm)  

The Spring MVC Architecture uses the following model:
[Spring_MVC_Arch_Model.pdf](https://github.com/donnerhanson/SimpleWebApp/files/6290677/Spring_MVC_Arch_Model.pdf) - model from ["Spring Framework 5: Beginner to Guru"](https://www.udemy.com/course/spring-framework-5-beginner-to-guru/learn/lecture/17814928#content)
1. Client Sends an HTTP request.
2. Dispatcher Serverlet Sends request to Controller
3. Controller interfaces with the Services
4. Services performs actions on data from the requested location
5. Service returns model to controller and returns model to the Dispatcher Servelet
6. Serverlet sends the model to the View component
7. View component renders the HTML (in this project thymeleaf is used).

This ensures separation of operations to ensure easier Implementation and Maintenence during the SDLC.   

 <!-- GETTING STARTED -->
 ## Getting Started

 To get a local copy up and running follow these simple steps.

 ### Prerequisites
 * Machine Requirements:  
 ```sh  
Tested with:
Java 11
Java SDK 11.0.9
Maven 10.14.6
On Mac OS Mojave  
 ```  

 ### Installation  

 1. Clone the repo  
 ```sh  
 git clone https://github.com/donnerhanson/SimpleWebApp.git
 ```  


 <!-- USAGE EXAMPLES -->
 ## Usage
Run using IntelliJ IDEA

 ## Example

 <!--1. Example: [text to display](pdf or filename here)  -->

```sh  
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.4)

2021-04-09 23:47:16.202  INFO 43899 --- [           main] c.s.s.Spring5webappApplication           : Starting Spring5webappApplication using Java 15.0.2 on donners-mbp-2.lan with PID 43899 (/Users/Donner/Desktop/Spring/SimpleWebApp/SimpleWebApp/spring5webapp/target/classes started by Donner in /Users/Donner/Desktop/Spring/SimpleWebApp/SimpleWebApp/spring5webapp)
2021-04-09 23:47:16.214  INFO 43899 --- [           main] c.s.s.Spring5webappApplication           : No active profile set, falling back to default profiles: default
2021-04-09 23:47:17.986  INFO 43899 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2021-04-09 23:47:18.112  INFO 43899 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 99 ms. Found 3 JPA repository interfaces.
2021-04-09 23:47:19.269  INFO 43899 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2021-04-09 23:47:19.294  INFO 43899 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-04-09 23:47:19.295  INFO 43899 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.44]
2021-04-09 23:47:19.502  INFO 43899 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-04-09 23:47:19.502  INFO 43899 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3096 ms
2021-04-09 23:47:19.794  INFO 43899 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2021-04-09 23:47:20.127  INFO 43899 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2021-04-09 23:47:20.227  INFO 43899 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2021-04-09 23:47:20.310  INFO 43899 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.29.Final
2021-04-09 23:47:20.538  INFO 43899 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2021-04-09 23:47:20.728  INFO 43899 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2021-04-09 23:47:21.700  INFO 43899 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-04-09 23:47:21.711  INFO 43899 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2021-04-09 23:47:22.288  WARN 43899 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2021-04-09 23:47:22.477  INFO 43899 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2021-04-09 23:47:22.865  INFO 43899 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-04-09 23:47:22.879  INFO 43899 --- [           main] c.s.s.Spring5webappApplication           : Started Spring5webappApplication in 7.849 seconds (JVM running for 8.964)
Started in Bootstrap
Number of books: 2
Number of authors: 3
Number of publishers: 1
2021-04-09 23:51:20.827  INFO 43899 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2021-04-09 23:51:20.829  INFO 43899 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2021-04-09 23:51:20.829  INFO 43899 --- [extShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2021-04-09 23:51:20.841  INFO 43899 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2021-04-09 23:51:20.845  INFO 43899 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Process finished with exit code 130 (interrupted by signal 2: SIGINT)


```



 <!-- CONTACT -->
 ## Contact

 Donner Hanson: hanso127@mail.chapman.edu  



 Project Link: [https://github.com/donnerhanson/SimpleWebApp](https://github.com/donnerhanson/SimpleWebApp)



 <!-- MARKDOWN LINKS & IMAGES -->
 <!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

 [linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
 [linkedin-url]: https://linkedin.com/in/donner-hanson
