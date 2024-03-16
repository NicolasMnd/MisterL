package com.misterl.location.positions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos3df {

    @Test
    public void testPos3df() {

        Pos3df pos = new Pos3df(1.0f, 2.0f, 3.0f);

        assertEquals(pos.x(), 1.0f);
        assertEquals(pos.y(), 2.0f);
        assertEquals(pos.z(), 3.0f);

        pos.addX(2.0f);
        assertEquals(pos.x(), 3.0f);

        pos.addY(3.0f);
        assertEquals(pos.y(), 5.0f);

        pos.addZ(4.0f);
        assertEquals(pos.z(), 7.0f);

        Pos3df cl = pos.clone();
        assertNotSame(cl, pos);
        assertEquals(cl, pos);

        Pos3di intpos = new Pos3di(1,2,3);
        assertFalse(intpos.equals(cl));
        Pos3di intpos2 = new Pos3di(3,5,7);
        assertTrue(intpos2.equals(cl));

    }

}
