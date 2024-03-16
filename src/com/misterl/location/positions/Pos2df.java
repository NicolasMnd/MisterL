package com.misterl.location.positions;

public class Pos2df extends Pos2d<Float> {

    public Pos2df(float x, float y) {
        super(x,y);
    }

    @Override
    protected void modify(int index, Object value) {
        super.modify(index, (float) value);
    }

    @Override
    public void addX(Float add) {
        this.modify(0, (float) this.x() + add);
    }

    @Override
    public void addY(Float add) {
        this.modify(1, (float) this.y() + add);
    }

    @Override
    public Pos2d<Float> subtract(Pos2d<Float> pos) {
        return new Pos2df(this.x() - pos.x(), this.y() - pos.y());
    }

    @Override
    public Pos2d<Float> add(Pos2d<Float> pos) {
        return new Pos2df(this.x() + pos.x(), this.y() + pos.y());
    }

    public Pos2df clone() {
        return new Pos2df(x(), y());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pos2di in)
            return this.x() == (float) in.x() && this.y() == (float) in.y();
        else if(obj instanceof Pos2df fin)
            return (float) this.x() == fin.x() && (float) this.y() == fin.y();
        else return false;
    }

}
