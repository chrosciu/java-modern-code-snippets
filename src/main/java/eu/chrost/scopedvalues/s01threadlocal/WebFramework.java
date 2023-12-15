package eu.chrost.scopedvalues.s01threadlocal;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
class WebFramework {
    private static final ThreadLocal<String> requestId = new ThreadLocal<>();
    //private static final ThreadLocal<String> requestId = new InheritableThreadLocal<>();

    static void handleRequest() {
        requestId.set(UUID.randomUUID().toString());
        log("Before handling request");
        try {
            Controller.handleRequest();
        } finally {
            log("After handling request");
            //requestId.remove();
        }
    }

    static void log(String message) {
        log.info("{} {}", requestId.get(), message);
    }

    static void mangle() {
        requestId.set(UUID.randomUUID().toString());
    }
}
