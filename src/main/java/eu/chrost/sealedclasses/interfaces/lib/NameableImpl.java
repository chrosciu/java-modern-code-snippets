package eu.chrost.sealedclasses.interfaces.lib;

public non-sealed class NameableImpl implements Nameable {
    @Override
    public String getName() {
        return "Dummy";
    }
}