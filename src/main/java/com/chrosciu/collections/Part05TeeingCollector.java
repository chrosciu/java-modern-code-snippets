package com.chrosciu.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

record Result(long count, double average) {}

@Slf4j
public class Part05TeeingCollector {

    private static Result calculateCountAndAverage(List<Integer> numbers) {
        var count = numbers.stream().collect(Collectors.counting());
        //notice that we need to open stream twice
        var average = numbers.stream().collect(Collectors.averagingDouble(i -> i));
        return new Result(count, average);
    }

    private static Result calculateCountAndAverageWithTeeing(List<Integer> numbers) {
        return numbers
                .stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.averagingDouble(i -> i),
                        Result::new
                ));
    }

    public static void main(String[] args) {
        var numbers = List.of(3, 6, 8, 10);
        log.info("{}", calculateCountAndAverage(numbers));
        log.info("With teeing: {}", calculateCountAndAverageWithTeeing(numbers));
    }
}
