package eu.chrost.trywithresources;

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
        // someResource = new SomeResource(); // does not compile with try-with-resources block
        try(someResource; otherResource) {
            log.info("Working in try block with resources : {}, {}", someResource, otherResource);
            throw new RuntimeException("Blah");
        }
    }
}
