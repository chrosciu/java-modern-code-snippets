package eu.chrost.sealedclasses.basic.app;

import eu.chrost.sealedclasses.basic.lib.Child;
import eu.chrost.sealedclasses.basic.lib.Parent;

// class MyChild extends Parent {}

public class App {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
