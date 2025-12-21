package org.example.config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

//    @Bean
//    String bye(){
//        return "bye";
//    }

    @Bean
    Integer five(){
        return 5;
    }
}
