package com.misterl.location.vectors;

import com.misterl.location.positions.Pos;
import com.misterl.location.positions.Pos2df;
import com.misterl.location.positions.Pos2di;
import com.misterl.location.positions.Pos3df;

public class Vec3d extends Vector {

    public Vec3d(Pos3df pos1, Pos3df pos2) {
        super(new Pos[] {pos1.clone(), pos2.clone()});
    }

    public Pos3df getStart() {
        return (Pos3df) this.getIndex(0);
    }

    public Pos3df getEnd() {
        return (Pos3df) this.getIndex(1);
    }

    /**
     * Get a position on the vector
     * @param percentage a number between 0f and 1f. Any number outside the bounds will be transformed to a number
     *                   inside the bounds. Negative numbers will be absoluted. Outside the range will be modulated.
     * @return a {@link Pos3df} on the vector
     */
    public Pos3df offset(float percentage) {
        if(percentage < 0 || percentage > 1)
            percentage = Math.abs(percentage) % 1;
        return new Pos3df(
                -percentage * (getStart().x() - getEnd().x()),
                -percentage * (getStart().y() - getEnd().y()),
                -percentage * (getStart().z() - getEnd().z())
        );
    }

    /**
     * Gets a position outside the vector bounds
     * @param offset a percentage in float
     * @return a {@link Pos3df} outside the vector limits
     */
    public Pos3df reach(float offset) {
        return new Pos3df(
                (offset * -(getStart().x() - getEnd().x())),
                (offset * -(getStart().y() - getEnd().y())),
                (offset * -(getStart().z() - getEnd().z()))
        );
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vec3d v)
            return v.getStart().equals(this.getStart()) && v.getEnd().equals(this.getEnd());
        return false;
    }

    public Vec3d clone() {
        return new Vec3d(this.getStart(), this.getEnd());
    }

}

