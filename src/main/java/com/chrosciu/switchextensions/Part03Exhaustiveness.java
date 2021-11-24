package com.chrosciu.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part03Exhaustiveness {
    public static void main(String[] args) {
        log.info(describeColor(Color.BLACK));
        log.info(describeColor(Color.WHITE));
        log.info(describeColor(Color.RED));
    }

    private static String describeColor(Color c) {
        return switch (c) {
            case BLACK, WHITE -> "Grayscale";
            case RED -> "Full";
        };
    }
}
