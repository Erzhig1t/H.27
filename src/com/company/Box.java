package com.company;

public class Box<T> {
    private T box;

    public Box(T box) {
        this.box = box;
    }

    public Box() {
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                '}';
    }
    public static Object box(Box box){

    return box;
    }

}
