package eu.chrost.unnamedvariables;

import lombok.extern.slf4j.Slf4j;

record Point(int x, int y) {}

record Circle(Point p, int r) {}

@Slf4j
class S03RecordPatterns {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        Circle c = new Circle(p, 4);
        describeShape(p);
        describeShape(c);
    }

    private static void describeShape(Object o) {
        switch (o) {
            case Point(var _, var y) -> log.info("Point with y: {}", y);
            case Circle(_, var r) -> log.info("Circle with r: {}", r);
            default -> log.info("POJO");
        }
    }
}
