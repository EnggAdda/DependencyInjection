package org.example.dependencyinjection.cunstructor;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void start() {
        System.out.println(  "Engine started");
    }
}
