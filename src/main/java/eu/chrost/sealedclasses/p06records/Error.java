package eu.chrost.sealedclasses.p06records;

record Error(Throwable cause) implements Result {
}
