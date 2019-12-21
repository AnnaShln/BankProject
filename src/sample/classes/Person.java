package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class Person {
    String name;
    String password;
    List<Project> projects = new LinkedList<>();
    List<String> tags = new LinkedList<>();
    public String getName() {
        return name;
    }
    public List<Project> getProjects() {
        return projects;
    }
    public List<String> getTags() {
        return tags;
    }
    public void addTag(String pTag) {
        tags.add(pTag);
    }
    public void addProject(Project pProject) {
        projects.add(pProject);
    }
    public static class Student extends Person {
        int course;
        String group;
        String inst; //институт (ИКНТ там и тд)
        //конструктор:
        Student(String pName, int pCourse, String pGroup, String pInst, String pPassword) {
            name = pName;
            course = pCourse;
            group = pGroup;
            inst = pInst;
            password = pPassword;
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
    public void removeProject(Project pProject) {
        int index = projects.indexOf(pProject);
        projects.remove(index);
    }

    //нужно создать функцию для записи списка проектов в файл

}
