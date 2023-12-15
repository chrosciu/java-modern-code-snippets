package eu.chrost.records.forbidden;

//abstract record AbstractCar(String name) {}

public record Car(String name, long price) {
    //String type;

    //public Car(String name, long price) throws Exception {}
}

class Dummy {}

//record InheritedCar extends Dummy {}

//class ChildCar extends Car {}
