package com.chrosciu.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part02SwitchExpressions {
    public static void main(String[] args) {
        log.info(describeLetterOldStyle('A'));
        log.info(describeLetterOldStyle('O'));
        log.info(describeLetterOldStyle('Z'));

        log.info(describeLetterNewStyle('A'));
        log.info(describeLetterNewStyle('O'));
        log.info(describeLetterNewStyle('Z'));
    }

    private static String describeLetterOldStyle(char c) {
        return switch (c) {
            case 'a', 'A': yield "First";
            case 'z', 'Z':
                log.info("In branch for z/Z");
                yield "Last";
            default: yield "Middle";
        };
    }

    private static String describeLetterNewStyle(char c) {
        return switch (c) {
            case 'a', 'A' -> "First";
            case 'z', 'Z' -> {
                log.info("In branch for z/Z");
                yield "Last";
            }
            default -> "Middle";
        };
    }
}
