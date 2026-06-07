package org.example.config;

import org.example.main.Parrot;
import org.example.main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.main")
public class ProjectConfig {

    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Coco");
        return p;
    }

    @Bean
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Person person(@Qualifier("parrot2") Parrot parrot){
        Person p = new Person();
        p.setName("Shlok");
        p.setParrot(parrot);
        return p;
    }

}
