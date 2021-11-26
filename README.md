# ChallengeCode


## Environment
+ Java 1.8
+ Maven 3.8.1
  
## Framework
+ Backend-SpringBoot
+ Frontend-Thymeleaf & Bootstrap
+ Test-SpringBootPackage（JUnit, Mockito, AssertJ...）

## Build & Run
```
> cd .
> mvn clean
> mvn install
> mvn package
```
There is an compiled one in target folder.
```
> cd target
> java -jar ZendeskTicketViewer-0.0.1-SNAPSHOT.jar
```
Then the website will run on localhost:8080
## Structure
```
.
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── zendeskticketviewer
│   │   │               ├── GlobalExceptionHandler.java
│   │   │               ├── Model
│   │   │               │   ├── Meta.java
│   │   │               │   ├── Reponse.java
│   │   │               │   ├── Ticket.java
│   │   │               │   └── Tuple.java
│   │   │               ├── TicketController.java
│   │   │               ├── TicketService.java
│   │   │               └── ZendeskTicketViewerApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   │           └── ticket.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── zendeskticketviewer
│                       ├── TicketControllerTest.java
│                       ├── TicketServiceTest.java
│                       └── ZendeskTicketViewerApplicationTests.java
```