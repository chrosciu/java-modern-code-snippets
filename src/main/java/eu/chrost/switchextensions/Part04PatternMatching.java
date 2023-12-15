package eu.chrost.switchextensions;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class Part04PatternMatching {
    public static void main(String[] args) {
        log.info(testObject(Color.BLACK));
        log.info(testObject("ABC"));
        log.info(testObject(new int[]{1, 2}));
        log.info(testObject(new Random()));
        log.info(testObject(null));
    }

    private static String testObject(Object o) {
        return switch (o) {
            case Color c -> "Color: " + c;
            case String s -> "Just string: " + s.toLowerCase();
            case int[] i -> "Integer array of size: " + i.length;
            default -> "POJO";
        };
    }

}
