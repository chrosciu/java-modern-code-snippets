package eu.chrost.sealedclasses.p04interfaces.app;

import eu.chrost.sealedclasses.p04interfaces.lib.Nameable;
import eu.chrost.sealedclasses.p04interfaces.lib.NameableImpl;
import lombok.extern.slf4j.Slf4j;

//class MyNameable implements Nameable {
//    @Override
//    public String getName() {
//        return null;
//    }
//}

@Slf4j
public class App {
    public static void main(String[] args) {
        Nameable nameable = new NameableImpl();
        log.info("{}", nameable.getName());
    }
}
