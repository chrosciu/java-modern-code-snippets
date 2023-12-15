package eu.chrost.scopedvalues.s01threadlocal;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

class Controller {
    @SneakyThrows
    static void handleRequest() {
        WebFramework.log("Start handling request");
        //...
        WebFramework.log("Finished handling request");

//        var thread = new Thread(() -> {
//            WebFramework.log("Start handling request");
//            //...
//            WebFramework.mangle();
//            WebFramework.log("Finished handling request");
//        });
//        thread.start();
//        thread.join();
    }
}
