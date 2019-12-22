package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateProjectController {

    private UtilController controller = UtilController.getInstance();
    BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    private TextField nameFieldProject;

    @FXML
    private Button createProjectButton;

    @FXML
    private TextField statusField;

    @FXML
    private TextField deadlinesField;

    @FXML
    private TextArea purposesField;

    @FXML
    private TextArea tasksField;

    @FXML
    private TextArea resourcesField;

    @FXML
    void initialize() {
        createProjectButton.setOnAction(event -> {
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", createProjectButton);
            bankOfProjects.createProject(nameFieldProject.getText(), purposesField.getText(),
                    statusField.getText(), tasksField.getText(), deadlinesField.getText(),
                    resourcesField.getText());
        });
    }

}
