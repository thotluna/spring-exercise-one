package me.eladiofeijoo.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final NotificationService service;

    public UserService(NotificationService servic) {
        service = servic;
    }

    public void notification(){
        service.printGreetings();
    }



}
