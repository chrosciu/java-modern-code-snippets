package eu.chrost.delegate;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

@Getter
@Setter
class Person {
    private int age;

    @Delegate
    private Nameable nameable;
}
