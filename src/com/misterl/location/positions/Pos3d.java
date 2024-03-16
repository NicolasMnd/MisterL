package com.misterl.location.positions;

public abstract class Pos3d<T> extends Pos {

    public Pos3d(T x, T y, T z) {
        super(new Object[] {x, y, z});
    }

    public T x() {
        return (T) this.getIndex(0);
    }

    public T y() {
        return (T) this.getIndex(1);
    }

    public T z() {
        return (T) this.getIndex(2);
    }

    public abstract void addX(T x);

    public abstract void addY(T y);

    public abstract void addZ(T z);

}
