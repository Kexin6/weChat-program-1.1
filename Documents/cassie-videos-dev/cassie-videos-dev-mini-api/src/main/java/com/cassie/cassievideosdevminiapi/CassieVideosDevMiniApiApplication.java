package com.cassie.cassievideosdevminiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cassie"})
public class CassieVideosDevMiniApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CassieVideosDevMiniApiApplication.class, args);
    }
}
