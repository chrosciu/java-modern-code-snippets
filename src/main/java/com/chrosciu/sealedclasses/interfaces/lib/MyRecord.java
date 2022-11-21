package com.chrosciu.sealedclasses.interfaces.lib;

public record MyRecord(String name) implements Nameable {
    @Override
    public String getName() {
        return name;
    }
}
