package de.malte.wineshopbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WineShopBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineShopBackendApplication.class, args);
    }

}
