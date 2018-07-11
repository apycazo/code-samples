# Spring Boot Gradle project

## Project setup

* Create a target directory: `mkdir spring-boot+gradle`
* Init the project with gradle: `gradle init`

The project structure after this will look like:

```
.
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── readme.md
└── settings.gradle
```

Now create the sources structure:

```bash
mkdir -p src/main/java
mkdir -p src/main/resources
mkdir -p src/test/java
mkdir -p src/test/resources
```

## Simple project

We are going to create a very basic spring boot rest API. To do this:

### Add required dependencies

Update build.gradle to look like this:

```groovy
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.3.RELEASE")
    }
}

apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'idea'
apply plugin: 'org.springframework.boot'
apply plugin: 'io.spring.dependency-management'

bootJar {
    baseName = 'gs-rest-service'
    version =  '0.1.0'
}

repositories {
    mavenCentral()
}

sourceCompatibility = 1.8
targetCompatibility = 1.8

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    testCompile('org.springframework.boot:spring-boot-starter-test')
}
```

### Create a source file

Create a package (directory): `demo/spring/gradle`, with a file on it: `App.java`, a include the following code:

```java
package demo.spring.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {

    public static void main (String [] args) {
        SpringApplication.run(App.class, args);
    }

    @RestController
    public static class Endpoints {

        @GetMapping("{text}")
        public String echo (@PathVariable String text) {

            return "Echo!" + text;
        }        
    }
}
```

Create a properties file: `src/main/resources/application.yml` (or .properties) and include:

```yaml
# Use '=' instead of ':' when use a .properties file.
server.port: 9000
```

### Try it out

Build the project jar with `gradle build`, or using the wrapper: `./gradlew build`. 

Run the service with `gradle bootRun`.

Go to http://localhost:9000/echo-test to check out the service response.

Service can be tested with `gradle test` (for details, `gradle test --info`).

Clean with `gradle clean` and use `--rerun-tasks` to repeat actions cached (like tests).

## VS Code

Note that for things to work properly, restarting VS Code might be required after the first `gradle build` for the java plugin to detect things correctly.

