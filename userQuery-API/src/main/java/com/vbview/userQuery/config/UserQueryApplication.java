package com.vbview.userQuery.config;

import com.vbview.database.config.DatabaseNeoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by tetragramato on 08/03/2015.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.vbview.userQuery")
@Import(DatabaseNeoConfiguration.class)
public class UserQueryApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserQueryApplication.class, args);
    }
}
