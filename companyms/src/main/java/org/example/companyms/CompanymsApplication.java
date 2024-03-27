package org.example.companyms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CompanymsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanymsApplication.class, args);
    }

}
