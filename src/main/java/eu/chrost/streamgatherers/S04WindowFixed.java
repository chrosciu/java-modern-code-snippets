package eu.chrost.streamgatherers;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

class S04WindowFixed {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .gather(Gatherers.windowFixed(3))
                .forEach(System.out::println);
    }
}