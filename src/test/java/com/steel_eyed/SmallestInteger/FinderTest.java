package com.steel_eyed.SmallestInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinderTest {
    private static final int[] ARRAY_1 = { 78, 56, 232, 12, 11, 43 };
    private static final int ARRAY_1_EXPECTED = 11;
    private static final int[] ARRAY_2 = { 78, 56, -2, 12, 8, -33 };
    private static final int ARRAY_2_EXPECTED = -33;
    private static final int[] ARRAY_3 = { 0, Integer.MIN_VALUE, Integer.MAX_VALUE };
    private static final int ARRAY_3_EXPECTED = Integer.MIN_VALUE;
    private static final int[] EMPTY_ARRAY = {};

    @Test
    public void array1ByStreamTest() throws Exception {
        assertEquals( ARRAY_1_EXPECTED, Finder.byStream( ARRAY_1 ) );
    }

    @Test
    public void array2ByStreamTest() throws Exception {
        assertEquals( ARRAY_2_EXPECTED, Finder.byStream( ARRAY_2 ) );
    }

    @Test
    public void array3ByStreamTest() throws Exception {
        assertEquals( ARRAY_3_EXPECTED, Finder.byStream( ARRAY_3 ) );
    }

    @Test( expected = Exception.class )
    public void emptyArrayByStreamTest() throws Exception {
        Finder.byStream( EMPTY_ARRAY );
    }
}
