package com.misterl.location.positions;

import com.misterl.location.positions.Pos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPos {

    @Test
    public void testPosConstructor() {

        Pos<Integer> pos1 = new Pos<>(1,2);
        Pos<Integer> pos2 = new Pos<>(3,4);

        assertEquals(pos1.getIndex(0),1);
        assertEquals(pos1.getIndex(1), 2);

        assertEquals(pos2.getIndex(0),3);
        assertEquals(pos2.getIndex(1), 4);

        pos1.modify(0, 2);
        assertEquals(pos1.getIndex(0), 2);

        pos1.modify(1, 3);
        assertEquals(pos1.getIndex(1), 3);

        assertNull(pos1.getIndex(20));
        assertNull(pos1.getIndex(-1));

        pos1.modify(20, null);
        assertEquals(pos1.getIndex(0), 2);

    }

}
