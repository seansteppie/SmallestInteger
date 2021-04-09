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
    public void array1ByStreamTest() throws ZeroLengthException {
        assertEquals( ARRAY_1_EXPECTED, Finder.byStream( ARRAY_1 ) );
    }

    @Test
    public void array2ByStreamTest() throws ZeroLengthException {
        assertEquals( ARRAY_2_EXPECTED, Finder.byStream( ARRAY_2 ) );
    }

    @Test
    public void array3ByStreamTest() throws ZeroLengthException {
        assertEquals( ARRAY_3_EXPECTED, Finder.byStream( ARRAY_3 ) );
    }

    @Test( expected = ZeroLengthException.class )
    public void emptyArrayByStreamTest() throws ZeroLengthException {
        Finder.byStream( EMPTY_ARRAY );
    }

    @Test
    public void array1ByForTest() throws ZeroLengthException {
        assertEquals( ARRAY_1_EXPECTED, Finder.byFor( ARRAY_1 ) );
    }

    @Test
    public void array2ByForTest() throws ZeroLengthException {
        assertEquals( ARRAY_2_EXPECTED, Finder.byFor( ARRAY_2 ) );
    }

    @Test
    public void array3ByForTest() throws ZeroLengthException {
        assertEquals( ARRAY_3_EXPECTED, Finder.byFor( ARRAY_3 ) );
    }

    @Test( expected = ZeroLengthException.class )
    public void emptyArrayByForTest() throws ZeroLengthException {
        Finder.byFor( EMPTY_ARRAY );
    }

    @Test
    public void array1BySortTest() throws ZeroLengthException {
        assertEquals( ARRAY_1_EXPECTED, Finder.bySort( ARRAY_1 ) );
    }

    @Test
    public void array2BySortTest() throws ZeroLengthException {
        assertEquals( ARRAY_2_EXPECTED, Finder.bySort( ARRAY_2 ) );
    }

    @Test
    public void array3BySortTest() throws ZeroLengthException {
        assertEquals( ARRAY_3_EXPECTED, Finder.bySort( ARRAY_3 ) );
    }

    @Test( expected = ZeroLengthException.class )
    public void emptyArrayBySortTest() throws ZeroLengthException {
        Finder.bySort( EMPTY_ARRAY );
    }
}
