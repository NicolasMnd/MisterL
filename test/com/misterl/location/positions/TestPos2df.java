package com.misterl.location.positions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos2df {

    Pos2df pos, pos2, pos3;

    @BeforeEach
    public void setVars() {
        pos = new Pos2df(0.1f, 0.2f);
        pos2 = new Pos2df(1f, 1f);
        pos3 = new Pos2df(2f, 3f);
    }

    @Test
    public void testPos2df() {

        assertEquals(pos.x(), 0.1f);
        assertEquals(pos.y(), 0.2f);

        pos.addX(0.2f);
        assertEquals(pos.x(), 0.3f);

        pos.addY(0.3f);
        assertEquals(pos.y(), 0.5f);

    }

    @Test
    public void testEquals() {
        pos = new Pos2df(1f,2f);
        Pos2di intpos = new Pos2di(1,2);

        assertTrue(pos.equals(intpos));
        assertFalse(pos.equals(new Pos2df(3f,4f)));

        assertFalse(pos.equals(1));
    }

    @Test
    public void testClone() {
        Pos2df cl = pos.clone();
        assertTrue(cl.equals(pos));
        assertNotSame(cl, pos);
    }

    @Test
    public void testAddSubtract() {
        assertTrue(pos2.subtract(pos3).equals(new Pos2df(-1f, -2f)));
        assertTrue(pos2.add(pos3).equals(new Pos2df(3f, 4f)));
    }

}
