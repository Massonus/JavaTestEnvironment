package org.test.lesson16.p3;

public class PenaltyException extends Exception{


    public PenaltyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PenaltyException(Throwable cause) {
        super(cause);
    }
}
