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


    public void addMember(Person member) {
        members.add(member);
    }
    public void changeStatus(String newStatus) {
        status = newStatus;
    }
    public void changePurpose(String newPurpose) {
        purpose = newPurpose;
    }

    public void changeResources(String newResources) {
        resources = newResources;
    }

    public void addTask(Project project, String newTask) {
        project.tasks = newTask;
    }

    public void addTag(Project project, String newTag) {
        project.tags.add(newTag);
    }

    //отложим пока PrintInfo

    //надо решить будет ли отдельный класс для поиска или же надо менять концепцию методов ифпроектхэз тратата
    //можно сразу в этих методах реализовать поиск по всем проектам
}
