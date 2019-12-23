package sample.classes;

import java.util.LinkedList;
import java.util.List;

public class BankOfProjects {
    static List<Project> allProjects = new LinkedList<>();
    static List<Person> allPeople = new LinkedList<>();
    static List<Person.Student> allStudents = new LinkedList<>();
    static List<Person.Teacher> allTeachers = new LinkedList<>();
    static String nameOnline = "";
    static Person OnlineUser;

    //admin login: totally, password: spice
    static Person.Teacher admin = new Person.Teacher("totally","admin",
            "admin","spice");

    List<String> tagsForProject1 = new LinkedList<>();
    List<String> tagsForProject2 = new LinkedList<>();

    public void addValuesToTagList(){
        tagsForProject1.add("Хороший");
        tagsForProject1.add("Душевный");
        tagsForProject2.add("С пивком потянет");
        tagsForProject2.add("Кто-нибудь доделайте");
    }

    Person.Teacher person1 = new Person.Teacher("Иванов Иван Геннадьевич",
            "Высшая школа общественных наук", "Доцент", "ivanovivan");
    Person.Teacher person2 = new Person.Teacher("Абакумова Галина Сергеевна",
            "Лаборатория \"Лазерные и плазменные технологии\"", "Ведущий инженер",
            "abakumovagalina");
    Person.Student person3 = new Person.Student("Козлов Михаил Владимирович", "3",
            "3630706/50001", "Гуманитарный институт", "kozlovmikhail", "Юриспруденция");
    Person.Student person4 = new Person.Student("Абрамова Юлия Григорьевна", "5",
            "3130309/20002", "Институт физики, нанотехнологий и телекоммуникаций", "abramovajulia",
            "Техническая физика");
    Project project1 = new Project("Суперкомпьютеры и их применение",
            "Спрогнозировать дальнейшее развитие суперкомпьютерных технологий",
            "Исследовать поколения суперкомпьютеров, рассмотреть различные сферы применения суперкомпьютеров",
            "Декабрь 2020", "Интернет", tagsForProject1);
    Project project2 = new Project("Внедрение компьютерных технологий в образовательную среду",
            "Изучить успешность внедрения компьютерных технологий в образовательную среду",
            "Рассмотреть преимущества и недостатки использования компьютерных технологий в образовании",
            "Март 2020 - август 2020", "Журналы, конференции", tagsForProject2);


    public void addSomePeople() {
        allPeople.add(admin);
        allPeople.add(person1);
        allPeople.add(person2);
        allPeople.add(person3);
        allPeople.add(person4);
        allTeachers.add(admin);
        allTeachers.add(person1);
        allTeachers.add(person2);
        allStudents.add(person3);
        allStudents.add(person4);
    }

    public void addSomeProjects(){
        allProjects.add(project1);
        allProjects.add(project2);
    }

    public void addSomeTagsToProjects(){
        project1.addTag("Информатика");
        project1.addTag("Искусственный интеллект");
        project2.addTag("Социальный опрос");
    }

    public void addSomeProjectsToPeople() {
        person1.addProjectToPerson(project1);
        person3.addProjectToPerson(project1);
        person2.addProjectToPerson(project2);
        person4.addProjectToPerson(project2);
        person4.addProjectToPerson(project1);
    }

    public void addSomeMembersToProjects() {
        project1.addPersonToProject(person1);
        project1.addPersonToProject(person3);
        project2.addPersonToProject(person2);
        project2.addPersonToProject(person4);
    }

    public void setOnlineUser(String onlineName, String onlinePassword) {
        for (Person part: allPeople) {
            if (part.name.equals(onlineName) && part.password.equals(onlinePassword)) OnlineUser = part;
        }
    }

    public String printAllPeople() {
        String textPeople = "";
        for (Person.Teacher man: allTeachers) {
            textPeople = textPeople + System.lineSeparator() + "Имя: " + man.name + System.lineSeparator()
                    + "Кафедра: " + man.faculty + System.lineSeparator() + "Должность: " + man.position
                    + System.lineSeparator() + "Теги: " + man.tags + System.lineSeparator()
                    + "Проекты: " + getProjectsNames(man) + System.lineSeparator();
        }
        for (Person.Student man: allStudents) {
            textPeople = textPeople + System.lineSeparator() + "Имя: " + man.name + System.lineSeparator()
                    + "Институт: " + man.inst + System.lineSeparator() + "Направление: " + man.branch
                    + System.lineSeparator() + "Курс: " + man.course + System.lineSeparator() + "Номер группы: "
                    + man.group + System.lineSeparator() + "Теги: " + man.tags + System.lineSeparator()
                    + "Проекты: " + getProjectsNames(man) + System.lineSeparator();
        }
        return textPeople;
    }

    public String printSearchForPerson(List<Person.Teacher> teachers, List<Person.Student> students) {
        String textPeople = "";
        for (Person.Teacher man: teachers) {
            textPeople = textPeople + System.lineSeparator() + "Имя: " + man.name + System.lineSeparator()
                    + "Кафедра: " + man.faculty + System.lineSeparator() + "Должность: " + man.position
                    + System.lineSeparator() + "Теги: " + man.tags + System.lineSeparator()
                    + "Проекты: " + getProjectsNames(man) + System.lineSeparator();
        }
        for (Person.Student man: students) {
            textPeople = textPeople + System.lineSeparator() + "Имя: " + man.name + System.lineSeparator()
                    + "Институт: " + man.inst + System.lineSeparator() + "Направление: " + man.branch
                    + System.lineSeparator() + "Курс: " + man.course + System.lineSeparator() + "Номер группы: "
                    + man.group + System.lineSeparator() + "Теги: " + man.tags + System.lineSeparator()
                    + "Проекты: " + getProjectsNames(man) + System.lineSeparator();
        }
        return textPeople;
    }

    public String printAllProjects() {
        String textProject = "";
        for (Project project: allProjects) {
            textProject = textProject + System.lineSeparator() + "Название проекта: " + project.name + System.lineSeparator()
                    + "Цели: " + project.getPurpose() + System.lineSeparator() + "Задачи: " + project.tasks
                    + System.lineSeparator() + "Сроки: " + project.getDeadlines() + System.lineSeparator()
                    + "Необходимые ресурсы: " + project.getResources() + System.lineSeparator()
                    + "Теги: " + project.tags + System.lineSeparator()
                    + "Участники проекта: " + getMembersNames(project) + System.lineSeparator();
        }
        return textProject;
    }

    public String printAllProjectsOfPerson(Person person) {
        String projectsOfPerson = "";
        for (Project project: person.projects) {
            projectsOfPerson = projectsOfPerson + System.lineSeparator() + "Название проекта: " + project.name + System.lineSeparator()
                    + "Цели: " + project.getPurpose() + System.lineSeparator() + "Задачи: " + project.tasks
                    + System.lineSeparator() + "Сроки: " + project.getDeadlines() + System.lineSeparator()
                    + "Необходимые ресурсы: " + project.getResources() + System.lineSeparator()
                    + "Теги: " + project.tags + System.lineSeparator()
                    + "Участники проекта: " + getMembersNames(project) + System.lineSeparator();
        }
        return projectsOfPerson;
    }

    public String printSearchForProject(List<Project> list) {
        String textProject = "";
        for (Project project: list) {
            textProject = textProject + System.lineSeparator() + "Название проекта: " + project.name + System.lineSeparator()
                    + "Цели: " + project.getPurpose() + System.lineSeparator() + "Задачи: " + project.tasks
                    + System.lineSeparator() + "Сроки: " + project.getDeadlines() + System.lineSeparator()
                    + "Необходимые ресурсы: " + project.getResources() + System.lineSeparator()
                    + "Теги: " + project.tags + System.lineSeparator()
                    + "Участники проекта: " + getMembersNames(project) + System.lineSeparator();
        }
        return textProject;
    }

    public String getProjectsNames (Person person) {
        String namesOfProjects = "";
        for (Project project: person.projects) {
            namesOfProjects = namesOfProjects + project.name + System.lineSeparator();
        }
        return namesOfProjects;
    }

    public String getMembersNames (Project project) {
        String namesOfMembers = "";
        for (Person person: project.members) {
            namesOfMembers = namesOfMembers + person.name + System.lineSeparator();
        }
        return namesOfMembers;
    }

    public List<Person.Teacher> tTagSearch(String pTag) {
        List<Person.Teacher> taggedTeachers = new LinkedList<>();
        for (Person.Teacher part: allTeachers) {
            if (part.tags.contains(pTag)) {
                taggedTeachers.add(part);
            }
        }
        return taggedTeachers;
    }

    public List<Person.Student> sTagSearch(String pTag) {
        List<Person.Student> taggedStudents = new LinkedList<>();
        for (Person.Student part: allStudents) {
            if (part.tags.contains(pTag)) {
                taggedStudents.add(part);
            }
        }
        return taggedStudents;
    }

    public List<Person.Teacher> tNameSearch(String pName) {
        List<Person.Teacher> teachers = new LinkedList<>();
        for (Person.Teacher part: allTeachers) {
            if (part.name.contains(pName)) {
                teachers.add(part);
            }
        }
        return teachers;
    }

    public List<Person.Student> sNameSearch(String pName) {
        List<Person.Student> students = new LinkedList<>();
        for (Person.Student part: allStudents) {
            if (part.name.contains(pName)) {
                students.add(part);
            }
        }
        return students;
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

    public void createProject(String prName, String prPurpose, String prTasks,
                              String prDeadlines, String prResources, List<String> prtags) {
        Project project = new Project(prName,prPurpose, prTasks,prDeadlines,prResources, prtags);
        allProjects.add(project);
    }

    public void createTeacher(String pName, String pFaculty, String pPosition, String pPassword) {
        Person.Teacher teacher = new Person.Teacher(pName, pFaculty, pPosition, pPassword);
        allTeachers.add(teacher);
    }

    public void createStudent(String pName, String pCourse, String pGroup,
                              String pInst, String pPassword, String pBranch) {
        Person.Student student = new Person.Student(pName, pCourse, pGroup, pInst, pPassword, pBranch);
        allStudents.add(student);
    }

    public List<String> listOfTags (String string) {
        List<String> resultOfTags = new LinkedList<>();
        for (String part: string.split(", ")) resultOfTags.add(part);
        return resultOfTags;
    }
}
