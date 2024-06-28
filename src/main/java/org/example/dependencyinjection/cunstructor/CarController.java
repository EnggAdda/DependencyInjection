package org.example.dependencyinjection.cunstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.task.ThreadPoolTaskSchedulerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
   //custructor injection
   /* private CarService   carService;

     @Autowired
    CarController(CarService carService){
         this.carService = carService;
     }*/
    //setter injection
  /* private CarService   carService;


    @Autowired
   public void setCarService(CarService carService)
   {
       this.carService = carService;
   }*/

    //field Injection
  @Autowired
    private CarService      carService;

  @GetMapping("/car")
    public void getCarStarted(){
        carService.startCar();
     }


}
