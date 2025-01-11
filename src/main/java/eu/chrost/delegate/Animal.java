package eu.chrost.delegate;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

@Getter
@Setter
class Animal {
    private String breed;

    @Delegate
    private Nameable nameable;
}
