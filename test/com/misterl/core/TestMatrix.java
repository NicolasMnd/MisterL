package com.misterl.core;

import com.misterl.math.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMatrix {

    Matrix m;

    @BeforeEach
    public void setVars() {
        m = new Matrix(1, 0, 0, 1);
    }

    @Test
    public void testQuadratic() {
        assertFalse(Matrix.isQuadratic(3));
        assertFalse(Matrix.isQuadratic(5));
        assertTrue(Matrix.isQuadratic(4));
    }

}
