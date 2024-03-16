package com.misterl.location.positions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos3di {

    @Test
    public void testPos3d() {

        Pos3di pos = new Pos3di(1, 2, 3);

        assertEquals(pos.x(), 1);
        assertEquals(pos.y(), 2);
        assertEquals(pos.z(), 3);

        pos.addX(2);
        assertEquals(pos.x(), 3);

        pos.addY(3);
        assertEquals(pos.y(), 5);

        pos.addZ(4);
        assertEquals(pos.z(), 7);

        Pos3di cl = pos.clone();
        assertNotSame(cl, pos);
        assertTrue(cl.equals(pos));

    }

}
