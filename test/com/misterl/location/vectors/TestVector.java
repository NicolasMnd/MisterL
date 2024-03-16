package com.misterl.location.vectors;

import com.misterl.location.positions.Pos;
import com.misterl.location.vectors.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestVector {

    @Test
    public void testVectorConstructor() {

        Pos<Integer>[] l = new Pos[] {
            new Pos<Integer>(1,2), new Pos<Integer>(3,4)
        };
        Vector<Integer> v = new Vector<>(l) {};

        assertEquals(v.getIndex(0).getIndex(0), 1);
        assertEquals(v.getIndex(0).getIndex(1), 2);
        assertEquals(v.getIndex(1).getIndex(0), 3);
        assertEquals(v.getIndex(1).getIndex(1), 4);

        assertNull(v.getIndex(0).getIndex(-1));
        assertNull(v.getIndex(-1));

        v.modify(-1, new Pos<Integer>(1,2));
        assertEquals(v.getIndex(0).getIndex(0), 1);

        v.modify(0, new Pos<Integer>(2,3));
        assertEquals(v.getIndex(0).getIndex(0), 2);

    }

}
