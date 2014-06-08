package net.daverix.slingerorm.query.sqlite;

import java.util.List;

public class SQLiteAndFilterNode implements ParentFilterNode {
    private final FilterNode left;
    private final FilterNode right;

    public SQLiteAndFilterNode(FilterNode left, FilterNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public FilterNode getLeftChild() {
        return left;
    }

    @Override
    public FilterNode getRightChild() {
        return right;
    }

    @Override
    public List filter() {
        return left.;
    }
}
