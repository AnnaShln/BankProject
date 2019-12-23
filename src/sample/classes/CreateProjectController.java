package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateProjectController {

    @FXML
    private TextField nameFieldProject;

    @FXML
    private Button continueCreateProjectButton;

    @FXML
    private TextField deadlinesField;

    @FXML
    private TextArea purposesField;

    @FXML
    private TextArea tasksField;

    @FXML
    private TextArea resourcesField;

    private UtilController controller = UtilController.getInstance();
    BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        continueCreateProjectButton.setOnAction(event -> {
            bankOfProjects.createProject(nameFieldProject.getText(), purposesField.getText(), tasksField.getText(), deadlinesField.getText(),
                    resourcesField.getText());
            controller.openNewWindow("/sample/fxmls/addMembersToProject.fxml", continueCreateProjectButton);
        });
    }

}
