package com.misterl.math;

public class SquareMatrix extends Matrix {

    /**
     * Creates a matrix object. Given entries must always follow {i^2 | i in N}
     * @param entry float values in row order given
     */
    public SquareMatrix(float... entry) {
        super((int) Math.sqrt(entry.length), entry);
        if(isQuadratic(entry.length))
            throw new IllegalArgumentException("Invalid length of float values");
    }

    float[][] initializeColumns(float[] input) {
        int lengthColumn = (int) Math.sqrt(input.length) - 1;
        int index = 0;
        float[][] columns = new float[lengthColumn][lengthColumn];
        for(int i = 0; i < input.length; i++) {
            columns[index][i % lengthColumn] = input[i];
            if(i == lengthColumn) index++;
        }

    }

    static boolean isQuadratic(int i) {
        float root = (float) Math.sqrt(i);
        return (float) (root - (int) root) == 0f;
    }

}
