package eu.chrost.sealedclasses.p03onefile.lib;

non-sealed class InlineChild extends Parent {
}

public sealed class Parent permits Child, InlineChild {
    public static Parent getInstance() {
        return new InlineChild();
    }
}
