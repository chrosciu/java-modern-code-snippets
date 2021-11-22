package com.chrosciu.records.features;

import lombok.extern.slf4j.Slf4j;

interface Nameable {
    String getName();
}

@Slf4j
record Car(String type, long price) implements Nameable {
    static int freeCount = 0;

    public Car {
        if (price == 0) {
            freeCount++;
        }
    }

    public static int getFreeCount() {
        return freeCount;
    }

    @Override
    public String getName() {
        return type;
    }

    public void printName() {
        interface Printable {
            void print(String s);
        }
        Printable printable = s -> log.info(s);
        printable.print(type);
    }
}

@Slf4j
public class App {
    public static void main(String[] args) {
        var car = new Car("Fiat", 1000);
        log.info("{}", car);
        log.info("{}", car.getName());
        log.info("{}", Car.getFreeCount());
        car.printName();
    }
}
