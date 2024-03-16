package com.misterl.location.vectors;

import com.misterl.location.positions.Pos2df;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVec2di {

    Vec2d vector;
    Vec2d vector1;
    Vec2d vector2;
    Pos2df start;
    Pos2df end;
    Pos2df start1;
    Pos2df end1;

    @BeforeEach
    public void initVars() {
        start = new Pos2df(0.0f, 0.0f);
        end = new Pos2df(0.0f, 1.0f);
        start1 = new Pos2df(0.03f, 0.0f);
        end1 = new Pos2df(3.0f, 1.1f);
        vector = new Vec2d(start, end);
        vector2 = new Vec2d(start1, end1);
        vector1 = new Vec2d(start, end);
    }

    @Test
    public void testVec2d() {

        assertTrue(vector.getStart().equals(start));
        assertTrue(vector.getEnd().equals(end));
        assertTrue(vector2.getStart().equals(start1));
        assertTrue(vector2.getEnd().equals(end1));

        start.addY(0.5f);
        assertTrue(vector.offset(0.5f).equals(start));
        assertTrue(vector.offset(1.5f).equals(start));

    }

    @Test
    public void testEquals() {
        assertFalse(vector2.equals(vector));
        assertTrue(vector1.equals(vector));
        assertFalse(vector.equals(new Pos2df(2f, 3f)));
    }

    @Test
    public void testReach() {

        start.addY(2f);
        assertTrue(vector.reach(2.0f).equals(start));

    }

}
