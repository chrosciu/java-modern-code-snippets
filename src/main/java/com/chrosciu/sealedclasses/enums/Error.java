package com.chrosciu.sealedclasses.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class Error extends Result<Void> {
    private final Throwable throwable;
}
