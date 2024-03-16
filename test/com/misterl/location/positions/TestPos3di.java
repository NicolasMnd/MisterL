package com.misterl.location.positions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos3di {

    Pos3di pos, pos2, pos3;

    @BeforeEach
    public void setVars() {
        pos = new Pos3di(1, 2, 3);
        pos2 = new Pos3di(10, 8, 7);
        pos3 = new Pos3di(5, 1, 11);
    }

    @Test
    public void testConstructor() {

        assertEquals(pos.x(), 1);
        assertEquals(pos.y(), 2);
        assertEquals(pos.z(), 3);

    }

    @Test
    public void testClone() {
        Pos3di cl = pos.clone();
        assertNotSame(cl, pos);
        assertTrue(cl.equals(pos));
    }

    @Test
    public void testAdd() {
        pos.addX(2);
        assertEquals(pos.x(), 3);

        pos.addY(3);
        assertEquals(pos.y(), 5);

        pos.addZ(4);
        assertEquals(pos.z(), 7);
    }

    @Test
    public void testAddSubtract() {
        assertTrue(pos2.subtract(pos3).equals(new Pos3df(5, 7,-4)));
        assertTrue(pos2.add(pos3).equals(new Pos3df(15, 9, 18)));
    }

}
