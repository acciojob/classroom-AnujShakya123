package com.driver;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository {
    private Map<String,Student> studentData=new HashMap<>();
    private Map<String,Teacher>teacherData=new HashMap<>();
    private Map<String, ArrayList<String>>teacherStudentMap=new HashMap<>();
    public void add(Student student) {
        studentData.put(student.getName(),student);
    }

    public void add(Teacher teacher) {
        teacherData.put(teacher.getName(),teacher);
    }

    public void add(String student, String teacher) {
        ArrayList<String> students = teacherStudentMap.getOrDefault(teacher, new ArrayList<String>());
        students.add(student);
        teacherStudentMap.put(teacher, students);
    }

    public Optional<Student> getStudent(String name) {
        if(studentData.containsKey(name)){
            return Optional.of(studentData.get(name));
        }
        return Optional.empty();
    }

    public Optional<Teacher> getTeacher(String name) {
        if(teacherData.containsKey(name)){
            return Optional.of(teacherData.get(name));
        }
        return Optional.empty();
    }

    public Teacher getTeacherByName(String name){
        if(teacherData.containsKey(name)){
            return teacherData.get(name);
        }
        return null;
    }

    public List<String> getStudentsByTeacher(String teacher) {
        return teacherStudentMap.getOrDefault(teacher,new ArrayList<>());
    }

    public List<String> getAllStudents() {
        return new ArrayList<>(studentData.keySet());
    }

    public void deleteStudent(String stud) {
        studentData.remove(stud);
    }
    public void deleteTeacher(String teacher){
        teacherData.remove(teacher);
        teacherStudentMap.remove(teacher);
    }

    public List<String> getAllTeachers(){
        return new ArrayList<>(teacherData.keySet());
    }
}
