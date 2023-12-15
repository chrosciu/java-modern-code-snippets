package eu.chrost.sealedclasses.onefile.app;

import eu.chrost.sealedclasses.onefile.lib.Parent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Parent parent = Parent.getInstance();
        log.info("{}", parent);
    }
}
