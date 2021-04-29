package com.steel_eyed.SmallestInteger;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Finder - given a non-empty array of ints, return the smallest value
 * <p>
 * @author Sean Steppie
 * <p>
 * @version 1.0.0        Date: 09/04/2021     Initial Version
 */
public class Finder {
    /**
     * Use {@link java.util.stream.IntStream IntStream} to find smallest int
     *
     * @param intArray non-empty array of ints
     * @return smallest int from array
     * @throws ZeroLengthException if the array is empty
     */
    public static int byStream( int[] intArray ) throws ZeroLengthException {
        return IntStream.of( intArray )
                .min()
                .orElseThrow( () -> new ZeroLengthException( "Invalid int array" ) );
    }

    /**
     * Use a for loop to find the smallest int in an array
     *
     * @param intArray non-empty array of ints
     * @return smallest int from array
     * @throws ZeroLengthException
     */
    public static int byFor( int[] intArray ) throws ZeroLengthException {
        isZeroLength( intArray );
        int smallest = intArray[ 0 ];
        for( int i = 1; i < intArray.length; i++ ) {
            int value = intArray[ i ];
            if( value < smallest ) {
                smallest = value;
            }
        }
        return smallest;
    }

    private static void isZeroLength( int[] intArray ) throws ZeroLengthException {
        if( intArray.length == 0 ) {
            throw new ZeroLengthException( "Empty array" );
        }
    }

    /**
     * Use sort to find the smallest int in an array
     *
     * @param intArray
     * @return smallest int
     * @throws ZeroLengthException
     */
    public static int bySort( int[] intArray ) throws ZeroLengthException {
        isZeroLength( intArray );
        Arrays.sort( intArray );
        return intArray[ 0 ];
    }
}
