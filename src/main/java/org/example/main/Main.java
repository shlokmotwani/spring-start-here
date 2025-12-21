package org.example.main;

import org.example.Parrot;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        String hello = context.getBean(String.class);
        Integer five = context.getBean(Integer.class);
        System.out.println(p.getName());
        System.out.println(hello);
        System.out.println(five);
    }
}