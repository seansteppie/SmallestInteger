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
    public static int byStream( int[] intArray ) throws Exception {
        return IntStream.of( intArray )
                .min()
                .orElseThrow( () -> new Exception( "Invalid int array" ) );
    }

    public static int byFor( int[] intArray ) throws Exception {
        if( intArray.length == 0 ) {
            throw new Exception( "Empty array" );
        }
        int smallest = Integer.MAX_VALUE;
        for( int value : intArray ) {
            if( value < smallest ) {
                smallest = value;
            }
        }
        return smallest;
    }
}
