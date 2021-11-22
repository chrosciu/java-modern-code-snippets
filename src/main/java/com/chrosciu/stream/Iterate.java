package com.chrosciu.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class Iterate {
    public static void main(String[] args) {
        var letters = Stream.iterate('A', c -> c <= 'Z', c -> (char)(c + 1));
        var list= letters.map(Object::toString).toList();
        log.info("{}", list);
    }
}
