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