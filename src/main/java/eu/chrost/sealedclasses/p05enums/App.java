package eu.chrost.sealedclasses.p05enums;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class App {
    public static void main(String[] args) {
        Result success = new Success<>("Succeeded!");
        //handleResult(success);
        handleResultWithSwitch(success);

        Result error = new Error(new RuntimeException("Blah!"));
        //handleResult(error);
        handleResultWithSwitch(error);

        Result nullResult = null;
        //handleResult(nullResult);
        handleResultWithSwitch(nullResult);
    }

    private static void handleResult(Result result) {
        if (result instanceof Success<?> s) {
            log.info("Success: {}", s.getOutcome());
        } else if (result instanceof Error e) {
            log.warn("Error: ", e.getCause());
        } else {
            assert null == result;
            log.info("Null");
        }
    }

    private static void handleResultWithSwitch(Result result) {
        switch (result) {
            case Success<?> s -> log.info("Success: {}", s.getOutcome());
            case Error e -> log.warn("Error: ", e.getCause());
            case null -> log.info("Null"); //optional case
        }
    }
}
