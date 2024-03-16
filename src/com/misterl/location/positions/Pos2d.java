package com.misterl.location.positions;

public abstract class Pos2d<T> extends Pos {

    public Pos2d(T x, T y) {
        super(new Object[] {x, y});
    }

    public T x() {
        return (T) super.getIndex(0);
    }

    public T y() {
        return (T) super.getIndex(1);
    }

    public abstract void addX(T add);

    public abstract void addY(T add);

}
