package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class AddMembersToProjectController {
    @FXML
    private Button createProjectButton;

    @FXML
    private ComboBox<String> choiceOfPersons;

    private UtilController controller = UtilController.getInstance();
    private BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        createProjectButton.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/mainWindow.fxml", createProjectButton)
        );
        for (Person man: bankOfProjects.allPeople) choiceOfPersons.getItems().add(man.name);


    }


}
