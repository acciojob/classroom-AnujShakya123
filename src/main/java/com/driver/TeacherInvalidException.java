package com.anuj_acciojob.classroom;

public class TeacherNotFoundException  extends RuntimeException {
    public TeacherNotFoundException(){
        super("Teacher data not present in the map");
    }
}
