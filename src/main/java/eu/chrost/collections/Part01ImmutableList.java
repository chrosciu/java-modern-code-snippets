package eu.chrost.collections;

import java.util.List;

public class Part01ImmutableList {
    public static void main(String[] args) {
        var list = List.of("A", "B");
        list.set(0, "C");
    }
}
