package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class Person {
    String name;
    int id;
    List<Project> projects = new LinkedList<>();
    public static List<String> tags = new LinkedList<>();
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void addTag(String pTag) {
        tags.add(pTag);
    }
    public void addProject(Project pProject) {
        projects.add(pProject);
    }
    class Student extends Person {
        int course;
        String group;
        String inst; //институт (ИКНТ там и тд)
        //конструктор:
        Student(String pName, int pId, int pCourse, String pGroup, String pInst) {
            name = pName;
            id = pId;
            course = pCourse;
            group = pGroup;
            inst = pInst;
        }
        //метод вывода инфы по студенту
    }
    class Teacher extends Person {
        String faculty;
        String position;
        //конструктор:
        Teacher(String pName, int pId, String pFaculty, String pPosition) {
            name = pName;
            id = pId;
            faculty = pFaculty;
            position = pPosition;
        }
    }
    public void removeProject(Project pProject) {
        int index = projects.indexOf(pProject);
        projects.remove(index);
    }
}
