package net.daverix.slingerorm.query;

import java.util.List;

public interface ToListStubbing<T> {
    List<T> toList();
    int count();
    T firstOrDefault();
}
