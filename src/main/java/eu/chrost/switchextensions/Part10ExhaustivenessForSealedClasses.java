package eu.chrost.switchextensions;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Part10ExhaustivenessForSealedClasses {

    sealed interface Parent {}

    static non-sealed class ChildOne implements Parent {}

    static final class ChildTwo implements Parent {}

    public static void main(String[] args) {
        log.info(checkType(new ChildOne()));
        log.info(checkType(new ChildTwo()));
    }

    private static String checkType(Parent p) {
        return switch (p) {
            case ChildOne c1 -> "Child 1";
            case ChildTwo c2 -> "Child 2";
        };
    }
}
