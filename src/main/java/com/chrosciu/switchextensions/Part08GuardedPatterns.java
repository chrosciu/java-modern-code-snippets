package com.chrosciu.switchextensions;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class Part08GuardedPatterns {
    public static void main(String[] args) {
        log.info(testObject(Color.BLACK));
        log.info(testObject("ABC"));
        log.info(testObject(new Random()));
    }

    private static String testObject(Object o) {
        return switch (o) {
            case String s && s.length() > 5 -> "Long string: " + s;
            case String s -> "Short string: " + s;
            case Color c -> "Color: " + c;
            default -> "POJO";
        };
    }
}
