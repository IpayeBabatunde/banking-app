Real Time REST API's for Banking Application Project 
Objectives -
- Build Real-Time REST API's for Banking App using Java, Spring Boot,
Spring Data JPA(Hibernate) and Mysql database.
- Build Rest API'S for Add Account, get all accounts,
transfer amount, deposit amount, remove account and more.
- Handle specific and Goloval Exceptions and Return Error Response
- Using Java Records as DTO to transfer the data between client and server
(Exception handling in springboot App)
- Handling exception in Spring Boot REST API'S is typically done using
the @Controlleradvice and @ExceptionHandler
- @ControllerAdvice enables globall exception handling for controllers
- @ExceptionHandler defines methods to handle specific exceptions within
a controller or globally with @ControllerAdvice
(Development Steps in Exception Handlinng)
- create custom exception named AccountException
- using AccountException
- create ErrorDetails Class to hold error response
- create GlobalExceptionHandler to handle specific exceptions as well
  as generic exception 
