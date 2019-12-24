package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class Project {

    String name;
    private String purpose;
    String tasks;
    private String deadlines;
    private String resources;
    List<String> tags = new LinkedList<>();
    List<Person> members = new LinkedList<>();

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getDeadlines() {
        return deadlines;
    }

    public String getResources() {
        return resources;
    }

    //конструктор:
    Project (String prName,String prPurpose, String prTasks,
                                  String prDeadlines, String prResources, List<String> prTags) {
        name = prName;
        purpose = prPurpose;
        tasks = prTasks;
        deadlines = prDeadlines;
        resources = prResources;
        tags = prTags;
    }

    public void addTag(String newTag) {
        tags.add(newTag);
        for (Person part: members)
        {
            if (!(part.tags.contains(newTag)))
            {
                part.tags.add(newTag);
            }
        }
    }

    public void addPersonToProject (Person person) {
        members.add(person);
    }
}
