package com.leetcode.dec2;

public class IlegalInputException extends RuntimeException {
    public IlegalInputException() {
        super();
    }

    public IlegalInputException(String customMessage) {
        super(customMessage);
    }
}
