package org.training.mercedes.generics;

public class GenericDataHolder<T,R> {
    private T data1;
    private R data2;

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public R getData2() {
        return data2;
    }

    public void setData2(R data2) {
        this.data2 = data2;
    }
}
