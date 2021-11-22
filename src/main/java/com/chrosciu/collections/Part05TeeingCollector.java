package com.chrosciu.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

record Result(long count, double average) {}

@Slf4j
public class Part05TeeingCollector {
    public static void main(String[] args) {
        var numbers = List.of(3, 6, 8, 10);
        var result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.averagingDouble(i -> i),
                        Result::new
                ));
        log.info("{}", result);
    }
}
