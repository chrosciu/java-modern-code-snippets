package com.chrosciu.sealedclasses.interfaces.lib;

public sealed interface Nameable permits NameableImpl {
    String getName();
}
