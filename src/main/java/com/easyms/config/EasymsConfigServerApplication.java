package com.easyms.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EasymsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymsConfigServerApplication.class, args);
    }

}
