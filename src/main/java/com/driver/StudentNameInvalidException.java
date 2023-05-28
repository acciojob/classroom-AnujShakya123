package com.anuj_acciojob.classroom;

public class StudentNameInvalidException extends RuntimeException {
    public StudentNameInvalidException() {
        super("Student data not found in the map");
    }
}
