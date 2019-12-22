package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StudentRegistrationController {

    private UtilController controller = UtilController.getInstance();
    RegistrationController registrationController = new RegistrationController();
    BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    private TextField groupField;

    @FXML
    private TextField instituteField;

    @FXML
    private TextField branchField;

    @FXML
    private TextField courceField;

    @FXML
    private Button finishRegistration;

    @FXML
    void initialize() {
        finishRegistration.setOnAction(event -> {
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", finishRegistration);
            bankOfProjects.createStudent(registrationController.newPersonName, courceField.getText(),
                    groupField.getText(), instituteField.getText(),
                    registrationController.newPersonPassword, branchField.getText());
            bankOfProjects.setOnlineUser(registrationController.newPersonName,registrationController.newPersonPassword);
        });
    }

}
