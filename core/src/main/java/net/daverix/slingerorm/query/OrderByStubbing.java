package net.daverix.slingerorm.query;

public interface OrderByStubbing<T> extends ToListStubbing<T>, AndStubbing<T>, OrStubbing<T> {
    OrderByDescendingStubbing<T> orderBy(String field);
}
