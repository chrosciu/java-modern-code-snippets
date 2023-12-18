package eu.chrost.sealedclasses.p06records;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class App {
    public static void main(String[] args) {
        Result success = new Success<>("Succeeded!");
        handleResultWithSwitch(success);

        Result error = new Error(new RuntimeException("Blah!"));
        handleResultWithSwitch(error);
    }

    private static void handleResultWithSwitch(@NonNull Result result) {
        switch (result) {
            case Success(var outcome) -> log.info("Success: {}", outcome);
            case Error(var cause) -> log.warn("Error: ", cause);
        }
    }
}
