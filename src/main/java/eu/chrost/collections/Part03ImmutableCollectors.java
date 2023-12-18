package eu.chrost.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class Part03ImmutableCollectors {
    public static void main(String[] args) {
        var originalList = Arrays.asList("A", "B");
        var list = originalList.stream()
                .map(String::toLowerCase)
                //.collect(Collectors.toUnmodifiableList()); //up to Java 15
                .toList(); //Java 16 and later
        originalList.set(0, "C");
        log.info("{}", originalList);
        list.set(0, "C");
    }
}
