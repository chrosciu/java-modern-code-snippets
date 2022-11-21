package com.chrosciu.sealedclasses.enums;

public abstract sealed class Result<T> permits Success, Error {
}
