package org.example.config;

import org.example.main.Parrot;
import org.example.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.main")
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Shlok");
        p.setParrot(parrot);
        return p;
    }
}
