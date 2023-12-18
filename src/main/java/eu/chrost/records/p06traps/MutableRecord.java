package eu.chrost.records.p06traps;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

record Integers(List<Integer> items) {}

@Slf4j
class MutableRecord {
    public static void main(String[] args) {
        var integers = new Integers(Arrays.asList(0, 1));
        var equalIntegers = new Integers(Arrays.asList(0, 1));
//        var integers = new Integers(Arrays.asList(0, 1));
//        var equalIntegers = new Integers(Arrays.asList(0, 1));
        log.info("{}", integers);
        log.info("{}", equalIntegers);
        log.info("{}", integers.equals(equalIntegers));

        integers.items().set(0, 2);
        log.info("{}", integers);
        log.info("{}", integers.equals(equalIntegers));
    }
}
