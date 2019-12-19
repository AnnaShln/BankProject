package sample.classes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.*;

public class Controller {

    @FXML
    private Button startRegistration;

    @FXML
    void initialize() {
        startRegistration.setOnAction(event -> {
            startRegistration.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/registration.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }



    class Member {

    }
    class Project {
        private String name;
        private int id;
        private String password;
        private String purpose;
        Map<String,List<Integer>> tasks = new HashMap<>();
        private String deadlines;
        private String resources;
        Map<String,List<Integer>> tags = new HashMap<>();
        List<Member> members = new LinkedList<>();
        List<Project> allProjects = new LinkedList<>();

        public boolean createProject (String name, Integer id, String password, String purpose, List<String> tasks,
                                  String deadlines, String resources) {
            Project newOne = new Project();
            newOne.name = name;
            newOne.id = id;
            newOne.password = password;
            newOne.purpose = purpose;
            // допишите сюда и на вход
            return allProjects.add(newOne);
        }

        public void removeProject(Project project) {
            // ищем в листе проект и удаляем его
        }

        //public List<Member> showMembers(Project project) {
            // вызывает список мемберов и возвращает его

        //}

        public void addMember(Project project, Member member) {
           project.members.add(member);
        }

        public void removeMember() {
            //аналогично
        }

        public void changeStatus(Project project, String newStatus) {

        }

        public void changePurpose(Project project, String newPurpose) {

        }

        public void changeResources(Project project, String newResources) {

        }

        public void addTask(Project project, String newTask) {
            //добавляем в список новую задачу. Кстати, стоит ли реализовывать нам задачи через список, подобно тэгам?
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
}