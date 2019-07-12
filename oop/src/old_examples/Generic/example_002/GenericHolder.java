package old_examples.Generic.example_002;

/**
 * Multiple type generic class example
 */
public class GenericHolder<K, V> {
    private K objK;
    private V objV;

    public GenericHolder(K objK, V objV) {
        this.objK = objK;
        this.objV = objV;
    }

    public K getObjK() {
        return objK;
    }

    public V getObjV() {
        return objV;
    }

    public void setObjK(K objK) {
        this.objK = objK;
    }

    public void setObjV(V objV) {
        this.objV = objV;
    }

    @Override
    public String toString() {
        return "Key: " + objK.toString() + " - Value: " + objV.toString();
    }
}
