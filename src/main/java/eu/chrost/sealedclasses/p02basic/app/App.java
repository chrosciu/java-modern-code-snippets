package eu.chrost.sealedclasses.p02basic.app;

import eu.chrost.sealedclasses.p02basic.lib.Child;
import eu.chrost.sealedclasses.p02basic.lib.Parent;

// class MyChild extends Parent {}

public class App {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
