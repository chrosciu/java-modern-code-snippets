package eu.chrost.sealedclasses.p05enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
final class Error extends Result {
    private final Throwable cause;
}
