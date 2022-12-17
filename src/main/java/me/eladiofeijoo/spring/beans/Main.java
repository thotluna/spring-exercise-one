package me.eladiofeijoo.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "beans.xml" );

        Saludos saludos = (Saludos) context.getBean("saludos");
        saludos.imprimirSaludo();

        UserService userService = (UserService) context.getBean("userService");
        userService.notification();

    }
}
