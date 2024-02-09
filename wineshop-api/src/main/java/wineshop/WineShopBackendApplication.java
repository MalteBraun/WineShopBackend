package de.malte.wineshopbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ComponentScan("wineshop.api")
@ComponentScan("wineshop.service")
public class WineShopBackendApplication extends DatabaseConfig {

    public static void main(String[] args) {
        SpringApplication.run(WineShopBackendApplication.class, args);
    }

}
