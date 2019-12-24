package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class AddProjectToOnlinePersonController {
    @FXML
    private Button endAddingProjects;

    @FXML
    private ComboBox<String> choiceOfProjects;

    @FXML
    private Button addProjectsToOnlinePersonButton;

    private UtilController controller = UtilController.getInstance();
    private BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        endAddingProjects.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/mainWindow.fxml", endAddingProjects)
        );
        for (Project project: bankOfProjects.allProjects) choiceOfProjects.getItems().add(project.name);
    }

    public void addProjectsToOnlinePerson() {
        for (Project project: bankOfProjects.allProjects){
            if (project.name == choiceOfProjects.getValue()) {
                bankOfProjects.OnlineUser.addProjectToPerson(project);
                project.addPersonToProject(bankOfProjects.OnlineUser);
            }
        }
    }
}
