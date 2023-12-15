package eu.chrost.sealedclasses.enums;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Result<String> success = new Success<>("Succeeded!");
        handleResult(success);
        handleResultWithSwitch(success);
        Result<?> error = new Error(new RuntimeException("Blah!"));
        handleResult(error);
        handleResultWithSwitch(error);
        handleResult(null);
        handleResultWithSwitch(null);
    }

    private static void handleResult(Result<?> result) {
        if (result instanceof Success<?> s) {
            log.info("Success: {}", s.getRv());
        } else if (result instanceof Error e) {
            log.warn("Error: ", e.getThrowable());
        } else {
            assert null == result;
            log.info("Null");
        }
    }

    private static void handleResultWithSwitch(Result<?> result) {
        switch (result) {
            case Success<?> s -> log.info("Success: {}", s.getRv());
            case Error e -> log.warn("Error: ", e.getThrowable());
            //case null -> log.info("Null"); //optional case
        }
    }
}
