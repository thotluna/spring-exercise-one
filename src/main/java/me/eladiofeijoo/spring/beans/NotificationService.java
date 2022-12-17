package me.eladiofeijoo.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void printGreetings(){
        System.out.println("Hello Word! in Notification Service");
    }
}
