package sample;

public class Controller {
    class Person {
        private String name;
        private int id;
       // private List<String> tags;
       // private list<Project> projects;

        Person() {
        }
    }
    class Project {
       // private string name;
        private int id;
       // private list<string> goals;
       // private list<string> tags;
       // private list<Person> performers;
        private Person admin;
        private Person initiator;
    }
}