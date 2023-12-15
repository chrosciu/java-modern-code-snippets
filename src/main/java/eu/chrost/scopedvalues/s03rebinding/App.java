package eu.chrost.scopedvalues.s03rebinding;

class App {
    private static final ScopedValue<String> X = ScopedValue.newInstance();
    public static void main(String[] args) {
        foo();
    }

    static void foo() {
        //System.out.println(X.get());
        ScopedValue.where(X, "hello").run(App::bar);
        //System.out.println(X.get());
    }

    static void bar() {
        System.out.println(X.get());
        ScopedValue.where(X, "goodbye").run(App::baz);
        System.out.println(X.get());
    }

    static void baz() {
        System.out.println(X.get());
    }
}
