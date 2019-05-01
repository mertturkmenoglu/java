package oop.generic;

import oop.annotation.DefaultConstructor;

public class TestGeneric<T> {

    private T obj;

    @DefaultConstructor
    TestGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
