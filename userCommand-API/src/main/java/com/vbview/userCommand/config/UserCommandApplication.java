package com.vbview.userCommand.config;

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
@ComponentScan("com.vbview.userCommand")
@Import(DatabaseNeoConfiguration.class)
public class UserCommandApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCommandApplication.class, args);
    }
}
