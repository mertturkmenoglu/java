package oop.exception.test;

import java.io.IOException;

public class InvalidNumberException extends IOException {
    public InvalidNumberException() {
        super();
    }
    public InvalidNumberException(String message) {
        super(message);
    }
}
