package sixth;

import java.io.Serializable;

public class Class<T extends String,V extends Animal,K extends Number> {
    T t;
    V v;
    K k;

    Class(T t0, V v0, K k0){

    }

    public void showTypes(){
        System.out.println("Тип Т: " + t.getClass().getName());
        System.out.println("Тип V: " + v.getClass().getName());
        System.out.println("Тип K: " + k.getClass().getName());
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}