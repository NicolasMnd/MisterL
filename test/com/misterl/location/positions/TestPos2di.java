package com.misterl.location.positions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos2di {

    Pos2di pos, pos2, pos3;

    @BeforeEach
    public void setVars() {
        pos = new Pos2di(1,2);
        pos2 = new Pos2di(1, 1);
        pos3 = new Pos2di(2, 3);
    }

    @Test
    public void testPos2di() {

        assertEquals(pos.x(), 1);
        assertEquals(pos.y(), 2);

        pos.addX(1);
        assertEquals(pos.x(), 2);
        pos.addY(1);
        assertEquals(pos.y(), 3);

    }

    @Test
    public void testEquals() {
        Pos2df posf = new Pos2df(1, 2);
        assertTrue(pos.equals(posf));

        assertFalse((new Pos2di(2,4)).equals(pos));
        assertFalse(pos.equals(1));
    }

    @Test
    public void testClone() {
        Pos2di cl = pos.clone();
        assertNotSame(cl, pos);
        assertEquals(pos, cl);

        assertTrue(cl.equals(pos));
    }

    @Test
    public void testAddSubtract() {
        assertTrue(pos2.subtract(pos3).equals(new Pos2df(-1, -2)));
        assertTrue(pos2.add(pos3).equals(new Pos2df(3, 4)));
    }

}
