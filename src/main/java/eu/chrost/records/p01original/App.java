package eu.chrost.records.p01original;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

class Car {
    private final String name;
    private final long price;

    Car(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car[" +
                "name='" + name + '\'' +
                ", price=" + price +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
@Slf4j
class App {
    public static void main(String[] args) {
        var car = new Car("Fiat", 1000);
        log.info("{}", car.getName());
        log.info("{}", car.getPrice());
        log.info("{}", car);

        var anotherCar = new Car("Toyota", 100);
        var equalCar = new Car("Fiat", 1000);
        log.info("{}", car.equals(anotherCar));
        log.info("{}", car.equals(equalCar));
    }
}
