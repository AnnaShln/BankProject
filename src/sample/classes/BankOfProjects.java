package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class BankOfProjects {
    List<Project> allProjects = new LinkedList<>();
    List<Person> allPeople = new LinkedList<>();

    public void createProject(List<Project> list, String prName, Integer prId, String prPurpose, String prTasks,
                              String prDeadlines, String prResources) {
        Project project = new Project(prName,prId,prPurpose,prTasks,prDeadlines,prResources);
        list.add(project);
    }

    public List<Person> pTagSearch(String pTag) {
        List<Person> taggedPeople = new LinkedList<>();
        for (Person part: allPeople) {
            if (part.tags.contains(pTag)) {
                taggedPeople.add(part);
            }
        }
        return taggedPeople;
    }

    public List<Person> pNameSearch(String pName) {
        List<Person> People = new LinkedList<>();
        for (Person part: allPeople) {
            if (part.name.indexOf(pName) != -1) {
                People.add(part);
            }
        }
        return People;
    }
    public List<Project> prNameSearch(String prName) {
        List<Project>  Projects = new LinkedList<>();
        for (Project part: allProjects) {
            if (part.name.indexOf(prName) != -1) {
                Projects.add(part);
            }
        }
        return Projects;
    }

    public List<Project> prTagSearch(String prTag) {
        List<Project> taggedProjects = new LinkedList<>();
        for (Project part : allProjects) {
            if (part.tags.contains(prTag)) {
                taggedProjects.add(part);
            }
        }
        return taggedProjects;
    }
}
