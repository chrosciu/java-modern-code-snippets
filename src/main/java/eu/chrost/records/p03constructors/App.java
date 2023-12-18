package eu.chrost.records.p03constructors;

import lombok.extern.slf4j.Slf4j;

record CarWithCustomCanonicalConstructor(String name, long price) {
    CarWithCustomCanonicalConstructor(String name, long price) {
        if (price < 0) {
            throw new IllegalArgumentException("Negative price is not allowed");
        }
        this.name = name;
        this.price = price;
    }
}

record CarWithCompactCanonicalConstructor(String name, long price) {
    CarWithCompactCanonicalConstructor {
        if (price < 0) {
            throw new IllegalArgumentException("Negative price is not allowed");
        }
    }
}

record CarWithOverloadedConstructor(String name, long price) {
    CarWithOverloadedConstructor(String name) {
        this(name, 0);
    }
}

@Slf4j
class App {
    public static void main(String[] args) {
        try {
            var car1 = new CarWithCustomCanonicalConstructor("Fiat", -1);
            log.info("{}", car1);
        } catch (Exception e) {
            log.warn("", e);
        }
        var car1a = new CarWithCustomCanonicalConstructor("Fiat", 1);
        log.info("{}", car1a);
        try {
            var car2 = new CarWithCompactCanonicalConstructor("Fiat", -1);
            log.info("{}", car2);
        } catch (Exception e) {
            log.warn("", e);
        }
        var car2a = new CarWithCompactCanonicalConstructor("Fiat", 1);
        log.info("{}", car2a);
        var car3 = new CarWithOverloadedConstructor("Fiat");
        log.info("{}", car3);
    }
}




