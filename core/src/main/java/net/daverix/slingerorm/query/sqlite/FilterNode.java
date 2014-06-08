package net.daverix.slingerorm.query.sqlite;

import java.util.List;

public interface FilterNode<T> {
    List<T> filter();
}
