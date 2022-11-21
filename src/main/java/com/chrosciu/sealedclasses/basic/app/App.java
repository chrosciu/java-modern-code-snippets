package com.chrosciu.sealedclasses.basic.app;

import com.chrosciu.sealedclasses.basic.lib.Child;
import com.chrosciu.sealedclasses.basic.lib.Parent;

// class MyChild extends Parent {}

public class App {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
