package eu.chrost.scopedvalues.s01threadlocal;

class App {
    public static void main(String[] args) {
        WebFramework.handleRequest();
        WebFramework.log("Request id should be null here");
    }
}
