package org.example.config;

import org.example.main.Parrot;
import org.example.main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"org.example.services", "org.example.repositories", "org.example.proxies", "org.example.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
