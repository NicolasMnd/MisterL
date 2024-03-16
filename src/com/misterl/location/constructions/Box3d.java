package com.misterl.location.constructions;

import com.misterl.location.positions.Pos3df;
import com.misterl.location.vectors.Vec3d;

public class Box3d {

    /**
     * All relevant variables
     */
    private final Pos3df corner1, corner2, corner1y, corner1x, corner1z, corner2y, corner2x, corner2z;

    public Box3d(Pos3df pos1, Pos3df pos2) {
        this.corner1 = pos1;
        this.corner2 = pos2;
        this.corner1x = new Pos3df(pos2.x(), pos1.y(), pos1.z());
        this.corner1y = new Pos3df(pos1.x(), pos2.y(), pos1.z());
        this.corner1z = new Pos3df(pos1.x(), pos1.y(), pos2.z());
        this.corner2x = new Pos3df(pos1.x(), pos2.y(), pos2.z());
        this.corner2y = new Pos3df(pos2.x(), pos1.y(), pos2.z());
        this.corner2z = new Pos3df(pos2.x(), pos2.y(), pos1.z());
    }

    public Pos3df getStartCorner() {
        return this.corner1.clone();
    }

    public Pos3df getEndCorner() {
        return this.corner2.clone();
    }

    public Pos3df getStartOffsetY() {
        return this.corner1y.clone();
    }

    public Pos3df getStartOffsetX() {
        return this.corner1x.clone();
    }

    public Pos3df getStartOffsetZ() {
        return this.corner1z.clone();
    }

    public Pos3df getEndOffsetY() {
        return this.corner2y.clone();
    }

    public Pos3df getEndOffsetX() {
        return this.corner2x.clone();
    }

    public Pos3df getEndOffsetZ() {
        return this.corner2z.clone();
    }

    /**
     * Gets the vectors of the box that connect all the box {@link Pos3df} positions
     * @return {@link Vec3d}
     */
    public Vec3d[] getVectors() {
        return new Vec3d[] {
                new Vec3d(corner1, corner1y),
                new Vec3d(corner1, corner1z),
                new Vec3d(corner1, corner1x),
                new Vec3d(corner2, corner2y),
                new Vec3d(corner2, corner2x),
                new Vec3d(corner2, corner2z),
                new Vec3d(corner2y, corner1x),
                new Vec3d(corner2y, corner1z),
                new Vec3d(corner1y, corner2x),
                new Vec3d(corner1y, corner2z),
        };
    }

}
