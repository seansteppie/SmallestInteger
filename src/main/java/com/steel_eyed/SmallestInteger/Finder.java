package com.steel_eyed.SmallestInteger;

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
}
