package com.misterl.location.positions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos2df {

    @Test
    public void testPos2df() {

        Pos2df pos = new Pos2df(0.1f, 0.2f);

        assertEquals(pos.x(), 0.1f);
        assertEquals(pos.y(), 0.2f);

        pos.addX(0.2f);
        assertEquals(pos.x(), 0.3f);

        pos.addY(0.3f);
        assertEquals(pos.y(), 0.5f);

        Pos2df cl = pos.clone();
        assertTrue(cl.equals(pos));
        assertNotSame(cl, pos);

        pos = new Pos2df(1f,2f);
        Pos2di intpos = new Pos2di(1,2);

        assertTrue(pos.equals(intpos));
        assertFalse(pos.equals(new Pos2df(3f,4f)));

    }

}
