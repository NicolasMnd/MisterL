package com.misterl.location.positions;

public class Pos<T> {

    private final int dimension;
    private final T[] positions;

    @SafeVarargs
    public Pos(T... type) {
        this.dimension = type.length;
        this.positions = type;
    }

    /**
     * Returns the value T at given index
     * @param index
     * @return T null in case index > {@link Pos#dimension}
     */
    public T getIndex(int index) {
        if(index >= dimension || index < 0) return null;
        else return positions[index];
    }

    /**
     * Modifies the value at index. Any invalid indices will be reported.
     * @param index an index inside the bounds of 0 and {@link Pos#dimension}
     * @param value the new value that should be at given index.
     */
    protected void modify(int index, T value) {
        if(index >= dimension || index < 0) {
            return;
        }
        this.positions[index] = value;
    }

    /**
     * Returns a formatted string of this object.
     * @return
     */
    public String getFormat() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i = 0; i < this.positions.length; i++) {
            builder.append(this.positions[i]);
            if(i < positions.length-1) builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

}
