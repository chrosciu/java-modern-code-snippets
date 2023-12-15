package eu.chrost.records.patterns;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class App {
    private static void extractAssets(Object o) {
        if (o instanceof Assets a) {
            log.info("Extracted assets: {}", a);
        }
        if (o instanceof Assets(House h, Car c)) {
            log.info("Extracted house: {}", h);
        }
        if (o instanceof Assets(House(String addr, double area), Car c)) {
            log.info("Extracted area: {}", area);
        }
        if (o instanceof Assets(var h, Car(var n, var p))) { //correct but IntelliJ shows error :)
            log.info("Extracted car with price: {}", p);
        }
        switch (o) {
            case Assets(House h, Car c) -> log.info("House: {}, car: {}", h, c);
            default -> log.info("No asset");
        }
    }

    public static void main(String[] args) {
        Assets assets = new Assets(
                new House("Main St. 3", 400),
                new Car("Fiat Punto", 10000)
        );
        extractAssets(assets);
    }
}
