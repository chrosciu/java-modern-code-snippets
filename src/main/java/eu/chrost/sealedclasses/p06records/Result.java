package eu.chrost.sealedclasses.p06records;

sealed interface Result permits Success, Error {
}
