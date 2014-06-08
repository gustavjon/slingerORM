package net.daverix.slingerorm.query;

public interface OrStubbing<T> {
    OperatorStubbing<T> or(String field);
}
