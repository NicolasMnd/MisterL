package com.misterl.location.positions;

public class Pos3di extends Pos3d<Integer> {

    public Pos3di(int x, int y, int z) {
        super(x, y, z);
    }

    public void multiply(int amount) {
        this.modify(0, this.x()*amount);
        this.modify(1, this.y()*amount);
        this.modify(2, this.z()*amount);
    }

    @Override
    protected void modify(int index, Object value) {
        super.modify(index, (Integer) value);
    }

    @Override
    public void addX(Integer x) {
        this.modify(0, x() + x);
    }

    @Override
    public void addY(Integer y) {
        this.modify(1, y() + y);
    }

    @Override
    public void addZ(Integer z) {
        this.modify(2, z() + z);
    }

    @Override
    public Pos3d<Integer> subtract(Pos3d<Integer> pos) {
        return new Pos3di(this.x() - pos.x(), this.y() - pos.y(), this.z() - pos.z());
    }

    @Override
    public Pos3d<Integer> add(Pos3d<Integer> pos) {
        return new Pos3di(this.x() + pos.x(), this.y() + pos.y(), this.z() + pos.z());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pos3di in)
            return (int) this.x() == (int) in.x() && (int) this.y() == (int) in.y();
        else if(obj instanceof Pos3df fin)
            return (float) this.x() == fin.x() && (float) this.y() == fin.y();
        else return false;
    }

    public Pos3di clone() {
        return new Pos3di((int) x(), (int) y(), (int) z());
    }
}
