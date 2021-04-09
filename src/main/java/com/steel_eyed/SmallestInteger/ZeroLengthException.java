package com.steel_eyed.SmallestInteger;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ZeroLengthException
 * <p>
 *
 * @author Sean Steppie
 * @version 1.0.0        Date: 09/04/2021     Initial Version
 */
@SuppressWarnings( "unused" )
public class ZeroLengthException extends Exception {
    public ZeroLengthException( String message ) {
        super( message );
    }

    public ZeroLengthException( String message, Throwable cause ) {
        super( message, cause );
    }

    public ZeroLengthException( Throwable cause ) {
        super( cause );
    }

    protected ZeroLengthException( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace( PrintStream s ) {
        super.printStackTrace( s );
    }

    @Override
    public void printStackTrace( PrintWriter s ) {
        super.printStackTrace( s );
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }
}
