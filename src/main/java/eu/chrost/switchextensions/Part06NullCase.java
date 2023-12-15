package eu.chrost.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part06NullCase {
    public static void main(String[] args) {
        log.info(testObject(Color.BLACK));
        log.info(testObject("ABC"));
        log.info(testObject(null));
    }

    private static String testObject(Object o) {
        return switch (o) {
            case Color c -> "Color: " + c;
            case null -> "Null value";
            case String s -> "Just string: " + s.toLowerCase();
            default -> "POJO";
            //case Object obj -> "POJO";
        };
    }
}
