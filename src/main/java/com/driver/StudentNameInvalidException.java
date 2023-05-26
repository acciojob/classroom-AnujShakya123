package com.driver;

public class StudentNameInvalidException extends RuntimeException {
    public StudentNameInvalidException(String student) {
        super("Invalid student name: " + student);
    }
}

