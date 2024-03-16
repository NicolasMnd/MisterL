package com.misterl.location.positions;

public class Pos3df extends Pos3d<Float> {

    public Pos3df(float x, float y, float z) {
        super(x, y, z);
    }

    @Override
    protected void modify(int index, Object value) {
        super.modify(index, (Float) value);
    }

    @Override
    public void addX(Float x) {
        this.modify(0, x() + x);
    }

    @Override
    public void addY(Float y) {
        this.modify(1, y() + y);
    }

    @Override
    public void addZ(Float z) {
        this.modify(2, z() + z);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pos3di in)
            return this.x() == (float) in.x() && this.y() == (float) in.y();
        else if(obj instanceof Pos3df fin)
            return (float) this.x() == fin.x() && (float) this.y() == fin.y();
        else return false;
    }

    public Pos3df clone() {
        return new Pos3df(x(), y(), z());
    }

}
