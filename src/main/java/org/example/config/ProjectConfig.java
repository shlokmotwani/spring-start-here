package org.example.config;

import org.example.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.main")
public class ProjectConfig {

//    Parrot parrot1(){
//        return new Parrot("Koko");
//    }
//
//    Parrot parrot2(){
//        return new Parrot("Miki");
//    }
//
//    Parrot parrot3(){
//        return new Parrot("Riki");
//    }
}
