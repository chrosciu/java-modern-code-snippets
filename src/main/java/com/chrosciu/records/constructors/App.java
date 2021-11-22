package com.chrosciu.records.constructors;

import lombok.extern.slf4j.Slf4j;

record CarWithCustomizedConstructor(String name, long price) {
    public CarWithCustomizedConstructor(String name, long price) {
        if (price < 0) {
            throw new IllegalArgumentException("Negative price is not allowed");
        }
        this.name = name;
        this.price = price;
    }
}

record CarWithCompactConstructor(String name, long price) {
    public CarWithCompactConstructor {
        if (price < 0) {
            throw new IllegalArgumentException("Negative price is not allowed");
        }
    }
}

record CarWithOverloadedConstructor(String name, long price) {
    public CarWithOverloadedConstructor(String name) {
        this(name, 0);
    }
}

@Slf4j
public class App {
    public static void main(String[] args) {
        var car1 = new CarWithCustomizedConstructor("Fiat", 1);
        log.info("{}", car1);
        var car2 = new CarWithCustomizedConstructor("Fiat", -1);
        log.info("{}", car2);
        var car3 = new CarWithOverloadedConstructor("Fiat");
        log.info("{}", car3);
    }
}




