package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class Person {
    String name;
    int id;
    String status; //преподаватель/студент
    List<Project> projects = new LinkedList<>();
    //тут должен быть лист с проектами
    //а еще лист с тегами
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
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
        //String subject;
        //метод вывода инфы по преподу
    }
    public void removeProject(Project project) {
        // ищем в листе проект и удаляем его
    }

}
