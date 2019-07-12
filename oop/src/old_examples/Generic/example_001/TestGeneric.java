package old_examples.Generic.example_001;

import old_examples.Annotation.example_001.DefaultConstructor;

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
