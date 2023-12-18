package eu.chrost.sealedclasses.p04interfaces.lib;

public sealed interface Nameable permits NameableImpl, ExtendedNameable, MyEnum, MyRecord {
    String getName();
}
