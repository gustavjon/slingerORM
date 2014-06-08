package net.daverix.slingerorm.query;

public interface AndStubbing<T> {
    OperatorStubbing<T> and(String field);
}
