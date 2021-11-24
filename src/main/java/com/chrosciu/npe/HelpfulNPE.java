package com.chrosciu.npe;

import lombok.extern.slf4j.Slf4j;

class Foo {
    public Bar bar() {
        return null;
    }
}

class Bar {
    public Quux quux() {
        return new Quux();
    }
}

class Quux {
    public int result() {
        return 0;
    }
}

//to disable message add : -XX:-ShowCodeDetailsInExceptionMessages switch

@Slf4j
public class HelpfulNPE {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int result = foo.bar().quux().result();
        log.info("{}", result);
    }
}
