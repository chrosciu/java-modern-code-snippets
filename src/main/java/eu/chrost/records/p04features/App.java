package eu.chrost.records.p04features;

import lombok.extern.slf4j.Slf4j;

interface Nameable {
    String getName();
}

@Slf4j
record Car(String type, long price) implements Nameable {
    static int freeCount = 0;

    Car {
        if (price == 0) {
            freeCount++;
        }
    }

    @Override
    public long price() {
        log.info("Getting price");
        return price;
    }

    static int getFreeCount() {
        return freeCount;
    }

    @Override
    public String getName() {
        return type;
    }

    void printName() {
        interface Printable {
            void print(String s);
        }
        Printable printable = s -> log.info(s);
        printable.print(type);
    }
}

@Slf4j
class App {
    public static void main(String[] args) {
        var car = new Car("Fiat", 1000);
        log.info("{}", car);
        log.info("{}", car.price());
        log.info("{}", car.getName());
        log.info("{}", Car.getFreeCount());
        car.printName();
    }
}
