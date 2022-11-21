package com.chrosciu.sealedclasses.interfaces.lib;

public sealed interface Nameable permits NameableImpl, ExtendedNameable, MyEnum, MyRecord {
    String getName();
}
