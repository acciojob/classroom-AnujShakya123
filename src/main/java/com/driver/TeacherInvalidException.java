package com.anuj_acciojob.classroom;

public class TeacherInvalidException  extends RuntimeException {
    public TeacherInvalidException(){
        super("Teacher data not present in the map");
    }
}
