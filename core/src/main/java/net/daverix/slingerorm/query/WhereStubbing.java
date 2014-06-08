package net.daverix.slingerorm.query;

public interface WhereStubbing<T> extends ToListStubbing<T> {
    OperatorStubbing<T> where(String field);
}
