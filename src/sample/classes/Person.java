package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class Person {
    public String name;
    public int id;
    public String password;
    public List<Project> projects = new LinkedList<>();
    public List<String> tags = new LinkedList<>();
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
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
    class Student extends Person {
        int course;
        String group;
        String inst; //институт (ИКНТ там и тд)
        //конструктор:
        Student(String pName, int pId, int pCourse, String pGroup, String pInst, String pPassword) {
            name = pName;
            id = pId;
            course = pCourse;
            group = pGroup;
            inst = pInst;
            password = pPassword;
        }
    }
    class Teacher extends Person {
        String faculty;
        String position;
        //конструктор:
        Teacher(String pName, int pId, String pFaculty, String pPosition, String pPassword) {
            name = pName;
            id = pId;
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
