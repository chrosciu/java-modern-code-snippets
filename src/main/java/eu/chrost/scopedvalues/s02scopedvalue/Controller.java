package eu.chrost.scopedvalues.s02scopedvalue;

import lombok.SneakyThrows;

import java.util.concurrent.StructuredTaskScope;

class Controller {
    @SneakyThrows
    static void handleRequest() {
        WebFramework.log("Start handling request");
        //...
        WebFramework.log("Finished handling request");

        try(var scope = new StructuredTaskScope.ShutdownOnFailure("", Thread.ofPlatform().factory())) {
            scope.fork(() -> {
                WebFramework.log("Start handling request");
                //...
                WebFramework.log("Finished handling request");
                return null;
            });
            scope.join().throwIfFailed();
        }

//        var thread = new Thread(() -> {
//            WebFramework.log("Start handling request");
//            //...
//            WebFramework.log("Finished handling request");
//        });
//        thread.start();
//        thread.join();
    }
}
