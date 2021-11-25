package com.chrosciu.switchextensions;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class Part07FlowScope {
    public static void main(String[] args) {
        log.info(testObject(Color.BLACK));
        log.info(testObject("ABC"));
        log.info(testObject(new Random()));

        testObjectOld(Color.BLACK);
        testObjectOld("ABC");
        testObjectOld(new Random());
    }

    private static String testObject(Object o) {
        return switch (o) {
            case String s -> {
                if (s.length() > 5) {
                    yield "Long string: " + s;
                }
                yield "Short string: " + s;
            }
            case Color c -> "Color: " + c;
            //case Integer i, case Float f -> "Integer or float";
            case Character c -> "Character: " + c; //c reused again as each case has its own scope
            default -> "POJO";
        };
    }

    private static void testObjectOld(Object o) {
        switch (o) {
            case String s:
                if (s.length() > 5) {
                    log.info("Long string: " + s);
                    break;
                }
                log.info("Short string: " + s);
                break; //cannot be removed
            case Color c:
                log.info("Color: " + c);
//            case Character c:
//                log.info("Character: " + c);
            default:
                log.info("POJO");
        };
    }
}
