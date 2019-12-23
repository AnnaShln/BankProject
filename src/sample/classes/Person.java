package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class Person {
    static List<Project> projects = new LinkedList<>();
    static List<String> tags = new LinkedList<>();
    String name;
    String password;
    public String getName() {
        return name;
    }

    public static class Student extends Person {
        String branch;
        String course;
        String group;
        String inst; //институт (ИКНТ там и тд)
        //конструктор:
        Student(String pName, String pCourse, String pGroup, String pInst, String pPassword, String pBranch) {
            name = pName;
            course = pCourse;
            group = pGroup;
            inst = pInst;
            password = pPassword;
            branch = pBranch;
        }
    }
    public static class Teacher extends Person {
        String faculty;
        String position;
        //конструктор:
        Teacher(String pName, String pFaculty, String pPosition, String pPassword) {
            name = pName;
            faculty = pFaculty;
            position = pPosition;
            password = pPassword;
        }
    }
}
