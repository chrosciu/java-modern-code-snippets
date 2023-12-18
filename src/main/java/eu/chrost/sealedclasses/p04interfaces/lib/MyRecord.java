package eu.chrost.sealedclasses.p04interfaces.lib;

public record MyRecord(String name) implements Nameable {
    @Override
    public String getName() {
        return name;
    }
}
