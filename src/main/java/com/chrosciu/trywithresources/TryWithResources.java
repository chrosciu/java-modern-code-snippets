package com.chrosciu.trywithresources;

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
    public static void main(String[] args) throws Exception {
        SomeResource someResource = new SomeResource();
        final OtherResource otherResource = new OtherResource();
        try(someResource; otherResource) {
            log.info("Working in try block");
        }
    }
}
