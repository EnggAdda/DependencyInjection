package org.example.dependencyinjection.cunstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {
  //  cunstructor injection
   /* private Engine engine  ;

    @Autowired
    public CarService(Engine engine) {
        this.engine = engine;
    }*/
//setter injection
 /*   private Engine engine  ;
   @Autowired
    public void setEngine(Engine engine) {

        this.engine = engine;
    }*/


    //field Injector
    @Autowired
    private Engine  engine;

    public void startCar(){
        engine.start();
    }
}
