package sample.classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BankOfProjects {
    List<Project> allProjects = new LinkedList<>();
    List<Project> allPeople = new LinkedList<>();
    Map<String,List<Person>> taggedPeople = new HashMap<>(); //ключ - тэг, значение - список людей с указанным тэгом
    Map<String,List<Person>> taggedProjects = new HashMap<>(); //то же самое с проектами

}
