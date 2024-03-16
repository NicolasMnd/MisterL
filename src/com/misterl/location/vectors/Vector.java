package com.misterl.location.vectors;

import com.misterl.location.positions.Pos;

public abstract class Vector<T> {

    private Pos<T>[] positions;
    private final int dimension;

    public Vector(Pos<T>[] positions) {
        this.positions = positions;
        this.dimension = positions.length;
    }

    final Pos<T> getIndex(int index) {
         if(index >= positions.length || index < 0)
             return null;
         else return positions[index];
    }

    /**
     * Modifies the value at index. Any invalid indices will be reported.
     * @param index
     * @param value
     */
    final void modify(int index, Pos<T> value) {
        if(index >= dimension || index < 0) {
            //System.out.println("[Error Vector#modify()]: index '" + index + "' invalid");
            return;
        }
        this.positions[index] = value;
    }





}
