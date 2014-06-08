package net.daverix.slingerorm.query.sqlite;

public interface ParentFilterNode<T> extends FilterNode<T> {
    FilterNode<T> getLeftChild();
    FilterNode<T> getRightChild();
}
