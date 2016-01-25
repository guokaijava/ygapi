package org.pro.ygapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration  
@ComponentScan
@SpringBootApplication
@EnableJpaRepositories
public class YgapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YgapiApplication.class, args);
    }
}
