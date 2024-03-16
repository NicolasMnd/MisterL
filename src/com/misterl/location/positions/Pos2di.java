package com.misterl.location.positions;

public class Pos2di extends Pos2d<Integer> {

    public Pos2di(int x, int y) {
        super(x, y);
    }

    @Override
    protected void modify(int index, Object value) {
        super.modify(index, (int) value);
    }

    @Override
    public void addX(Integer add) {
        this.modify(0, (int) this.x() + add);
    }

    @Override
    public void addY(Integer add) {
        this.modify(1, (int) this.y() + add);
    }

    public Pos2di clone() {
        return new Pos2di(x(), y());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pos2di in)
            return this.x() == in.x() && this.y() == in.y();
        else if(obj instanceof Pos2df fin)
            return (float) this.x() == fin.x() && (float) this.y() == fin.y();
        else return false;
    }

}
