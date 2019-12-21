package sample.classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Project {
    public String getName() {
        return name;
    }
    String name;
    private int id;
    private String purpose;
    private String status;
    String tasks;
    private String deadlines;
    private String resources;
    List<String> tags = new LinkedList<>();
    List<Person> members = new LinkedList<>();

    //конструктор:
    Project (String prName, Integer prId, String prPurpose, String prTasks,
                                  String prDeadlines, String prResources) {
        name = prName;
        id = prId;
        purpose = prPurpose;
        tasks = prTasks;
        deadlines = prDeadlines;
        resources = prResources;
    }


    public void addMember(Project project, Person member) {
        project.members.add(member);
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
        project.tasks = newTask;
        //добавляем в список новую задачу. Кстати, стоит ли реализовывать нам задачи через список, подобно тэгам?
        //М: мне кажется, что нет, не надо, ибо не вижу смысла
    }

    public void addTag(Project project, String newTag) {project.tags.add(newTag); }

    //отложим пока PrintInfo

    //надо решить будет ли отдельный класс для поиска или же надо менять концепцию методов ифпроектхэз тратата
    //можно сразу в этих методах реализовать поиск по всем проектам
}
