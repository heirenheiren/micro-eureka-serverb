package com.micro.eureka.serverb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroEurekaServerbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroEurekaServerbApplication.class, args);
    }
}
