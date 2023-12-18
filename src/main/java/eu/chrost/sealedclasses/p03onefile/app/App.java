package eu.chrost.sealedclasses.p03onefile.app;

import eu.chrost.sealedclasses.p03onefile.lib.Parent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Parent parent = Parent.getInstance();
        log.info("{}", parent);
    }
}
