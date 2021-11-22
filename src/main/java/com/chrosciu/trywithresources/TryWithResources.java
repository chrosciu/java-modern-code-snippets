package com.chrosciu.trywithresources;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class SomeResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        log.info("Closing SomeResource");
    }
}

@Slf4j
class OtherResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        log.info("Closing OtherResource");
    }
}

@Slf4j
public class TryWithResources {
    @SneakyThrows
    public static void main(String[] args)  {
        SomeResource someResource = new SomeResource();
        final OtherResource otherResource = new OtherResource();
        try(someResource; otherResource) {
            log.info("Working in try block");
        }
    }
}
