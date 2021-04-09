package com.steel_eyed.SmallestInteger;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Finder
 * <p>
 *
 * @author Sean Steppie
 * @version 1.0.0        Date: 09/04/2021     Initial Version
 */
public class Finder {
    public static int byStream( int[] intArray ) throws ZeroLengthException {
        return IntStream.of( intArray )
                .min()
                .orElseThrow( () -> new ZeroLengthException( "Invalid int array" ) );
    }

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

    public static int bySort( int[] intArray ) throws ZeroLengthException {
        isZeroLength( intArray );
        Arrays.sort( intArray );
        return intArray[ 0 ];
    }
}
