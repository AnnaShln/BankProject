package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class ShowMyProjectsController {
    @FXML
    private Button addProjectButton;

    @FXML
    private Text textMyProjects;

    private UtilController controller = UtilController.getInstance();
    static BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    public void initialize() {
        textMyProjects.setText(bankOfProjects.printAllProjectsOfPerson(bankOfProjects.OnlineUser));
        addProjectButton.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/addProjectToOnlinePerson.fxml", addProjectButton)
        );
    }
}
