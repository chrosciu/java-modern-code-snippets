package com.chrosciu.optional;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class IfPresentOrElse {
    public static void main(String[] args) {
        handle(Optional.of("A"));
        handle(Optional.empty());
    }

    private static void handle(Optional<String> optional) {
        optional.ifPresentOrElse(s -> log.info("Value: {}", s), () -> log.info("No value !"));
    }
}
