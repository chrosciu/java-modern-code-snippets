package eu.chrost.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part05TypeDomination {
    public static void main(String[] args) {
        log.info(testObject(2));
    }

    private static String testObject(Object o) {
        return switch (o) {
            case Number n -> "Number: " + n.doubleValue();
            //case Integer i -> "Integer: " + i.intValue();
            default -> "POJO";
        };
    }
}
