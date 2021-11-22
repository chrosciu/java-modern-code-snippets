package com.chrosciu.records.basics;

import lombok.extern.slf4j.Slf4j;

record Car(String name, long price) {
}

@Slf4j
public class App {
    public static void main(String[] args) {
        var car = new Car("Fiat", 1000);
        var anotherCar = new Car("Toyota", 100);
        var equalCar = new Car("Fiat", 1000);
        log.info("{}", car);
        log.info("{}", car.price());
        log.info("{}", car.equals(anotherCar));
        log.info("{}", car.equals(equalCar));
    }
}
