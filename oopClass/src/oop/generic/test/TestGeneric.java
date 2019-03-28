package oop.generic.test;

public class TestGeneric<T> {

    private T obj;

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
