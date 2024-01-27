package org.test.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private CarEngine carEngine;

    @Autowired
    public Car(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    public void setCarEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    public void getCarEngine() {
        System.out.println(carEngine.getEngine());
    }
}
