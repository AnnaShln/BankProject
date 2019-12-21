package sample.classes;

import java.util.LinkedList;
import java.util.List;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
import java.nio.file.*;

public class BankOfProjects {
    List<Project> allProjects = new LinkedList<>();
    List<Person> allPeople = new LinkedList<>();
    Person OnlineUser;
    private File filePeople = new File("People");
    private File fileProjects = new File("Projects.txt");

    public void setOnlineUser(Person pOnline) {
        OnlineUser = pOnline;
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
            if (part.name.contains(pName)) {
                People.add(part);
            }
        }
        return People;
    }

    public List<Project> prNameSearch(String prName) {
        List<Project>  Projects = new LinkedList<>();
        for (Project part: allProjects)
            if (part.name.contains(prName)) {
                Projects.add(part);
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

    public void createProject(String prName, String prPurpose, String prStatus,String prTasks,
                              String prDeadlines, String prResources) {
        Project project = new Project(prName,prPurpose, prStatus, prTasks,prDeadlines,prResources);
        allProjects.add(project);
    }
    public void createTeacher(String pName, String pFaculty, String pPosition, String pPassword) {
        Person.Teacher teacher = new Person.Teacher(pName, pFaculty, pPosition, pPassword);
        allPeople.add(teacher);
    }
    public void createStudent(String pName, int pCourse, String pGroup, String pInst, String pPassword) {
        Person.Student student = new Person.Student(pName, pCourse, pGroup, pInst, pPassword);
        allPeople.add(student);
    }

    public void projectsToFile() throws Exception
    {
        FileWriter writer = new FileWriter("Projects.txt");
        for(Project part: allProjects) {
            writer.write(part.getName() + System.getProperty("line.separator"));
            writer.write(part.getDeadlines() + System.getProperty("line.separator"));
            writer.write(part.getPurpose() + System.getProperty("line.separator"));
            writer.write(part.getResources() + System.getProperty("line.separator"));
            writer.write(part.getStatus()+ System.getProperty("line.separator"))
        }
        writer.close();
    }

    public void projectsFromFile()  throws Exception
    {
        FileReader fr= new FileReader("Projects.txt");
        Scanner scan = new Scanner(fr);
        String name;
        String purpose;
        String status;
        String tasks;
        String deadlines;
        String resources;
        int i = 0;
        int count =0;
        while (scan.hasNextLine()) {
            name = scan.nextLine();
            purpose =scan.nextLine();
            status = scan.nextLine();
            tasks = scan.nextLine();
            deadlines = scan.nextLine();
            resources = scan.nextLine();
            createProject(name, purpose,status, tasks, deadlines,resources);
            //добавить запись проекта в список проектов
        }

        fr.close();


    }
    }
}
