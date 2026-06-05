package org.example.config;

import org.example.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "Koko")
    @Primary
    Parrot parrot1(){
        return new Parrot("Koko");
    }

    @Bean(name = "Miki")
    Parrot parrot2(){
        return new Parrot("Miki");
    }

    @Bean(name = "Riki")
    Parrot parrot3(){
        return new Parrot("Riki");
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
