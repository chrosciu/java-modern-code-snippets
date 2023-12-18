package eu.chrost.sealedclasses.p05enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
final class Success<T> extends Result {
    private final T outcome;
}
