package me.seno.designpatterns.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = context.getBean("Hello", String.class);
        String hello1 = context.getBean("Hello", String.class);

        System.out.println(hello == hello1);
    }
}
