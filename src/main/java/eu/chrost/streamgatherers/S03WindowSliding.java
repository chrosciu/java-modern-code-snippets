package eu.chrost.streamgatherers;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

class S03WindowSliding {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .gather(Gatherers.windowSliding(3))
                .forEach(System.out::println);
    }
}
