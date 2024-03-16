package com.misterl.location.vectors;

import com.misterl.location.positions.Pos;
import com.misterl.location.positions.Pos2df;
import com.misterl.location.positions.Pos2di;

public class Vec2d extends Vector {

    public Vec2d(Pos2df pos1, Pos2df pos2) {
        super(new Pos[] {pos1.clone(), pos2.clone()});
    }

    public Pos2df getStart() {
        return (Pos2df) this.getIndex(0);
    }

    public Pos2df getEnd() {
        return (Pos2df) this.getIndex(1);
    }

    /**
     * Get a position on the vector
     * @param percentage a number between 0f and 1f. Any number outside the bounds will be transformed to a number
     *                   inside the bounds. Negative numbers will be absoluted. Outside the range will be modulated.
     * @return a {@link Pos2df} on the vector
     */
    public Pos2df offset(float percentage) {
        if(percentage < 0 || percentage > 1)
            percentage = Math.abs(percentage) % 1;
        return new Pos2df(
                -percentage * (getStart().x() - getEnd().x()),
                -percentage * (getStart().y() - getEnd().y())
        );
    }

    /**
     * Gets a position outside the vector bounds
     * @param offset a percentage in float
     * @return a {@link Pos2df} outside the vector limits
     */
    public Pos2df reach(float offset) {
        return new Pos2df(
                (offset * -(getStart().x() - getEnd().x())),
                (offset * -(getStart().y() - getEnd().y()))
        );
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vec2d v)
            return v.getStart().equals(this.getStart()) && v.getEnd().equals(this.getEnd());
        return false;
    }
}
