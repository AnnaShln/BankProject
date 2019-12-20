package sample.classes;

public class Project {
    String name;
    int id;
    //тут лист с персонами
    //а еще лист с тегами
    public String getName() {
        return name;
    }
    public void setName(String pr_name) {
        this.name = pr_name;
    }
    public int getId() {
        return id;
    }
    public void setId(int pr_id) {
        this.id = pr_id;
    }
    //тут метод вывода инфы по проекту
    //метод по добавлению участников
}
