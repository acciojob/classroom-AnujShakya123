package com.driver;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

@l
public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }
    public Teacher(String name, int numberOfStudents, int age) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
    }
}