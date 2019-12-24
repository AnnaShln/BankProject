package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.LinkedList;
import java.util.List;

public class MainWindowController {


    @FXML
    private TextField fieldForSearchForProject;

    @FXML
    private Button buttonForSearchProject;

    @FXML
    private RadioButton searchForName;

    @FXML
    private RadioButton searchForTag;

    @FXML
    private Text textProjects;

    @FXML
    private Text textPerson;

    @FXML
    private RadioButton searchForPersonTag;

    @FXML
    private RadioButton searchForPersonName;

    @FXML
    private TextField fieldForSearchForPerson;

    @FXML
    private Button logOut;

    @FXML
    private Text nameInMainWindow;

    @FXML
    private Button myProjects;

    @FXML
    private TextField tagField;

    @FXML
    private Button addTag;

    @FXML
    private Button createProject;

    private UtilController controller = UtilController.getInstance();
    static BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        nameInMainWindow.setText(bankOfProjects.nameOnline);
        logOut.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/start.fxml", logOut)
        );
        createProject.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/createProject.fxml", createProject)
        );
        myProjects.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/showMyProjects.fxml", myProjects)
        );

    }

    public void searchForProject() {
        String value = fieldForSearchForProject.getText();
        List<Project> resultOfSearch = new LinkedList<>();
        if (searchForName.isSelected()) resultOfSearch = bankOfProjects.prNameSearch(value);
        if (searchForTag.isSelected()) resultOfSearch = bankOfProjects.prTagSearch(value);
        textProjects.setText(bankOfProjects.printSearchForProject(resultOfSearch));
    }

    public void searchPerson() {
        String value = fieldForSearchForPerson.getText();
        List<Person.Teacher> resultOfSearchTeacher = new LinkedList<>();
        List<Person.Student> resultOfSearchStudent = new LinkedList<>();
        if (searchForPersonName.isSelected()) {
            resultOfSearchTeacher = bankOfProjects.tNameSearch(value);
            resultOfSearchStudent = bankOfProjects.sNameSearch(value);
        }
        if (searchForPersonTag.isSelected()) {
            resultOfSearchTeacher = bankOfProjects.tTagSearch(value);
            resultOfSearchStudent = bankOfProjects.sTagSearch(value);
        }
        textPerson.setText(bankOfProjects.printSearchForPerson(resultOfSearchTeacher, resultOfSearchStudent));
    }

    public void showAllProjects() {
        textProjects.setText(bankOfProjects.printAllProjects());
    }

    public void showAllPersons() {
        textPerson.setText(bankOfProjects.printAllPeople());
    }

    public void addTagToPersonOnline() {
        for (Person man: bankOfProjects.allPeople) {
            if (man.name.equals(bankOfProjects.nameOnline)) bankOfProjects.OnlineUser.addTagToPerson(tagField.getText());
            textPerson.setText(bankOfProjects.printAllPeople());
        }
    }
}
