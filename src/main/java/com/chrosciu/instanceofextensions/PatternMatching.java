package com.chrosciu.instanceofextensions;

class Parent {
    boolean eligible() {
        return true;
    }
}

class One extends Parent {
    public void foo() {}
}

class Two extends Parent {
    public void bar() {}
}

class Three {}

public class PatternMatching {
    public static void main(String[] args) {
        Parent p = new One();
        handle(p);
    }

    private static void handle(Parent p) {
        if (p instanceof One o && o.eligible()) {
            o.foo();
//        } else if (p instanceof Two t || t.eligible()) {
//            t.bar();
//        } else if (p instanceof Object o) {
//
//        } else if (p instanceof Three t) {
//
        }
    }
}
