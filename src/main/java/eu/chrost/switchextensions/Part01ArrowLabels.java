package eu.chrost.switchextensions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Part01ArrowLabels {
    public static void main(String[] args) {
        describeLetterOldStyle('A');
        describeLetterOldStyle('O');
        describeLetterOldStyle('Z');

        describeLetterNewStyle('A');
        describeLetterNewStyle('O');
        describeLetterNewStyle('Z');
    }

    private static void describeLetterOldStyle(char c) {
        switch (c) {
            case 'a', 'A':
                //int x = 7;
                log.info("First");
                break;
            case 'z', 'Z':
                //int x = 8;
                log.info("In branch for z/Z");
                log.info("Last");
                break;
            default: log.info("Middle");
        }
    }

    private static void describeLetterNewStyle(char c) {
        switch (c) {
            case 'a', 'A' -> log.info("First");
            case 'z', 'Z' -> {
                int x = 8;
                log.info("In branch for z/Z");
                log.info("Last");
            }
            default -> {
                int x = 9;
                log.info("Middle");
            }
         }
    }

}
