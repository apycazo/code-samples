# Spring Boot Maven project

This project is the same as 'spring-boot+gradle', but using maven instead of gradle. To test use the following commands:

* Package: `mvn package`
* Clean: `mvn clean`
* Run: `mvn spring-boot:run`
* Test: `mvn test`

## Adding a maven wrapper

To include a maven wrapper like the one used by gradle, we can use the command:

```bash
mvn -N io.takari:maven:wrapper
```

To request a specific maven version, for example 3.5.2 use:

```bash
mvn -N io.takari:maven:wrapper -Dmaven=3.5.2
```