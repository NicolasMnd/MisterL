package com.misterl.location.vectors;

import com.misterl.location.positions.Pos3df;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVec3df {

    Vec3d vector1;
    Pos3df start1;
    Pos3df end1;

    @BeforeEach
    public void initVars() {
        start1 = new Pos3df(0f, 0f, 0f);
        end1 = new Pos3df(0f, 0f, 1f);
        vector1 = new Vec3d(start1, end1);
    }

    @Test
    public void testConstructor() {
        assertTrue(vector1.getStart().equals(start1));
        assertTrue(vector1.getEnd().equals(end1));
    }

    @Test
    public void testPercentage() {
        start1.addZ(0.5f);
        assertTrue(vector1.offset(0.5f).equals(start1));
    }

    @Test
    public void testReach() {
        start1.addZ(1.5f);
        assertTrue(vector1.offset(1.5f).equals(start1));
    }

    @Test
    public void testClone() {
        Vec3d cl = vector1.clone();
        assertNotSame(cl, vector1);
        assertTrue(cl.equals(vector1));
    }

}
