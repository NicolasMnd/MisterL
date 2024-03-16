package com.misterl.location.positions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos3df {

    Pos3df pos, pos2, pos3;

    @BeforeEach
    public void setVars() {
        pos = new Pos3df(1.0f, 2.0f, 3.0f);
        pos2 = new Pos3df(2f, 3f, 4f);
        pos3 = new Pos3df(5f, 8f, 10f);
    }

    @Test
    public void testConstructor() {

        assertEquals(pos.x(), 1.0f);
        assertEquals(pos.y(), 2.0f);
        assertEquals(pos.z(), 3.0f);

    }

    @Test
    public void testCloneEquals() {
        Pos3df cl = pos.clone();
        assertNotSame(cl, pos);
        assertEquals(cl, pos);

        Pos3di intpos = new Pos3di(1,2,3);
        assertTrue(intpos.equals(cl));
        assertFalse(pos2.equals(intpos));
    }

    @Test
    public void testAdd() {
        pos.addX(2.0f);
        assertEquals(pos.x(), 3.0f);

        pos.addY(3.0f);
        assertEquals(pos.y(), 5.0f);

        pos.addZ(4.0f);
        assertEquals(pos.z(), 7.0f);
    }

    @Test
    public void testAddSubtract() {
        assertTrue(pos2.subtract(pos3).equals(new Pos3df(-3f, -5f,-6f)));
        assertTrue(pos2.add(pos3).equals(new Pos3df(7f, 11f, 14f)));
    }

}
