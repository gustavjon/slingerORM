package net.daverix.slingerorm.query;

public interface OperatorStubbing<T> {
    OrderByStubbing<T> equalTo(String value);
    OrderByStubbing<T> equalTo(int value);
    OrderByStubbing<T> equalTo(long value);
    OrderByStubbing<T> equalTo(float value);
    OrderByStubbing<T> equalTo(double value);
    OrderByStubbing<T> equalTo(short value);
    OrderByStubbing<T> equalTo(boolean value);

    OrderByStubbing<T> notEqualTo(String value);
    OrderByStubbing<T> notEqualTo(int value);
    OrderByStubbing<T> notEqualTo(long value);
    OrderByStubbing<T> notEqualTo(float value);
    OrderByStubbing<T> notEqualTo(double value);
    OrderByStubbing<T> notEqualTo(short value);
    OrderByStubbing<T> notEqualTo(boolean value);

    OrderByStubbing<T> moreThan(int value);
    OrderByStubbing<T> moreThan(long value);
    OrderByStubbing<T> moreThan(float value);
    OrderByStubbing<T> moreThan(double value);
    OrderByStubbing<T> moreThan(short value);

    OrderByStubbing<T> moreThanOrEqualTo(String value);
    OrderByStubbing<T> moreThanOrEqualTo(int value);
    OrderByStubbing<T> moreThanOrEqualTo(long value);
    OrderByStubbing<T> moreThanOrEqualTo(float value);
    OrderByStubbing<T> moreThanOrEqualTo(double value);
    OrderByStubbing<T> moreThanOrEqualTo(short value);

    OrderByStubbing<T> lessThan(int value);
    OrderByStubbing<T> lessThan(long value);
    OrderByStubbing<T> lessThan(float value);
    OrderByStubbing<T> lessThan(double value);
    OrderByStubbing<T> lessThan(short value);

    OrderByStubbing<T> lessThanOrEqualTo(String value);
    OrderByStubbing<T> lessThanOrEqualTo(int value);
    OrderByStubbing<T> lessThanOrEqualTo(long value);
    OrderByStubbing<T> lessThanOrEqualTo(float value);
    OrderByStubbing<T> lessThanOrEqualTo(double value);
    OrderByStubbing<T> lessThanOrEqualTo(short value);

    OrderByStubbing<T> in(String[] array);
    OrderByStubbing<T> in(int[] array);
    OrderByStubbing<T> in(long[] array);
    OrderByStubbing<T> in(float[] array);
    OrderByStubbing<T> in(double[] array);
    OrderByStubbing<T> in(short[] array);
}
