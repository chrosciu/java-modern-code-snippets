package com.chrosciu.sealedclasses.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class Success<T> extends Result<T> {
    private final T rv;
}
