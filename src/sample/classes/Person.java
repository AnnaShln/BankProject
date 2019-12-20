package sample.classes;

public class Person {
    String name;
    int id;
    //тут должен быть лист с проектами
    //а еще лист с тегами
    public String getName() {
        return name;
    }
    public void setName(String p_name) {
        this.name = p_name;
    }
    public int getId() {
        return id;
    }
    public void setId(int p_id) {
        this.id = p_id;
    }
    class Student extends Person {
        int course;
        String group;
        String inst; //институт (ИКНТ там и тд)
        //метод вывода инфы по студенту
    }
    class Teacher extends Person {
        String faculty;
        String position;
        //String subject;
        //метод вывода инфы по преподу
    }
}
