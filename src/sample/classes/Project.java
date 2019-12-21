package sample.classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Project {
    private String name;
    private int id;
    private String password; //пароль придумывается при создании проекта?
    private String purpose;
    private String status;
    List<String> tasks = new LinkedList<>();
    private String deadlines;
    private String resources;
    List<String> tags = new LinkedList<>();
    List<Person> members = new LinkedList<>();

    //конструктор:
    Project (String prName, Integer prId, String prPassword, String prPurpose, List<String> prTasks,
                                  String prDeadlines, String prResources) {
        name = prName;
        id = prId;
        password = prPassword;
        purpose = prPurpose;
        //tasks
        //deadlines
        resources = prResources;
    }

    public void addMember(Project project, Person member) {
        project.members.add(member);
    }

    public void removeMember() {

    }

    public void changeStatus(Project project, String newStatus) {
       // project.status = newStatus;
    }

    public void changePurpose(Project project, String newPurpose) {
        project.purpose = newPurpose;
    }

    public void changeResources(Project project, String newResources) {
      project.resources = newResources;
    }

    public void addTask(Project project, String newTask) {
        //добавляем в список новую задачу. Кстати, стоит ли реализовывать нам задачи через список, подобно тэгам?
        //М: мне кажется, что нет, не надо, ибо не вижу смысла
    }

    public void addTag(Project project, String newTag) {

        //добавляем в список новый тэг
    }

    //отложим пока PrintInfo

    //public boolean ifProjectHasTag(Project project, String tag) {
    //возвращаем результат contains()
    //}

    //public boolean ifProjectHasTask(Project project, String task) {
    //возвращаем результат contains()
    //}

    //public boolean ifProjectHasName(Project project, String word) {
    //разбить его имя split (можно сплитом в еще один список
    // разбить имя проекта и по этому списку уже искать совпадение слова
    //}

    //надо решить будет ли отдельный класс для поиска или же надо менять концепцию методов ифпроектхэз тратата
    //можно сразу в этих методах реализовать поиск по всем проектам
}
