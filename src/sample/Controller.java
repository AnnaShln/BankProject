package sample;

public class Controller {
    class Person {
        private string name;
        private int id;
        private list<string> tags;
        private list<Project> projects;
    }
    class Project {
        private string name;
        private int id;
        private list<string> goals;
        private list<string> tags;
        private list<Person> performers;
        private Person admin;
        private Person initiator;
        private int test;
    }
}