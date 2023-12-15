package eu.chrost.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part09ExhaustivenessForPatternMatching {
    public static void main(String[] args) {
        testObject("ABC");
        testInteger(2);
    }

    private static void testObject(Object o) {
        switch (o) {
            case Color c -> log.info("Color: " + c);
            case String s -> log.info("Just string: " + s.toLowerCase());
            default -> log.info("POJO"); //cannot be removed
        };
    }

    private static void testInteger(Integer x) {
        switch (x) {
            case 1 -> log.info("One");
            case 2 -> log.info("Two");
            //case null -> log.info("null");
        }
    }


}
