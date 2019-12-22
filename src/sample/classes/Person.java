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
    public void removeProject(Project pProject) {
        int index = projects.indexOf(pProject);
        projects.remove(index);
    }

    //нужно создать функцию для записи списка проектов в файл

}
