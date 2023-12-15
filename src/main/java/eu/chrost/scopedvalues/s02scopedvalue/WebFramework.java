package eu.chrost.scopedvalues.s02scopedvalue;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
class WebFramework {
    private static final ScopedValue<String> requestId = ScopedValue.newInstance();

    static void handleRequest() {
        ScopedValue.where(requestId, UUID.randomUUID().toString()).run(() -> {
            log("Before handling request");
            Controller.handleRequest();
            log("After handling request");
        });
    }

    static void log(String message) {
        log.info("{} {}", requestId.isBound() ? requestId.get() : "(null)", message);
    }
}
