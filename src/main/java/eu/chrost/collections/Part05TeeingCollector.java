package eu.chrost.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

record Result(long sum, double average) {}

@Slf4j
class Part05TeeingCollector {

    private static Result calculateCountAndAverage(List<Integer> numbers) {
        var count = numbers.stream().collect(Collectors.summingInt(i -> i));
        //notice that we need to open stream twice
        var average = numbers.stream().collect(Collectors.averagingDouble(i -> i));
        return new Result(count, average);
    }

    private static Result calculateCountAndAverageWithTeeing(List<Integer> numbers) {
        return numbers
                .stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(i -> i),
                        Collectors.averagingDouble(i -> i),
                        (count, average) -> new Result(count, average)
                ));
    }

    public static void main(String[] args) {
        var numbers = List.of(3, 6, 8, 10);
        log.info("{}", calculateCountAndAverage(numbers));
        log.info("With teeing: {}", calculateCountAndAverageWithTeeing(numbers));
    }
}
