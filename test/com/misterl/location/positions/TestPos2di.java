package com.misterl.location.positions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos2di {

    @Test
    public void testPos2di() {

        Pos2di pos = new Pos2di(1,2);

        assertEquals(pos.x(), 1);
        assertEquals(pos.y(), 2);

        pos.addX(1);
        assertEquals(pos.x(), 2);
        pos.addY(1);
        assertEquals(pos.y(), 3);

        Pos2di cl = pos.clone();
        assertNotSame(cl, pos);
        assertEquals(pos, cl);

        assertTrue(cl.equals(pos));

        Pos2df posf = new Pos2df(2f, 3f);
        assertTrue(pos.equals(posf));

        assertFalse((new Pos2di(2,4)).equals(pos));

    }

}
