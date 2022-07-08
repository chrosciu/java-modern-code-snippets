package com.chrosciu.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part01ArrowLabels {
    public static void main(String[] args) {
        describeLetterOldStyle('A');
        describeLetterOldStyle('O');
        describeLetterOldStyle('Z');

        describeLetterNewStyle('A');
        describeLetterNewStyle('O');
        describeLetterNewStyle('Z');
    }

    private static void describeLetterOldStyle(char c) {
        switch (c) {
            case 'a', 'A':
                log.info("First");
                break;
            case 'z', 'Z':
                log.info("In branch for z/Z");
                log.info("Last");
                break;
            default: log.info("Middle");
        }
    }

    private static void describeLetterNewStyle(char c) {
        switch (c) {
            case 'a', 'A' -> log.info("First");
            case 'z', 'Z' -> {
                log.info("In branch for z/Z");
                log.info("Last");
            }
            default -> log.info("Middle");
         }
    }

}
