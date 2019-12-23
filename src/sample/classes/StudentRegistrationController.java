package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StudentRegistrationController {

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

    private UtilController controller = UtilController.getInstance();
    RegistrationController registrationController = new RegistrationController();
    BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        finishRegistration.setOnAction(event -> {
            bankOfProjects.createStudent(registrationController.newPersonName, courceField.getText(),
                    groupField.getText(), instituteField.getText(),
                    registrationController.newPersonPassword, branchField.getText());
            bankOfProjects.nameOnline = registrationController.newPersonName;
            bankOfProjects.setOnlineUser(registrationController.newPersonName,registrationController.newPersonPassword);
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", finishRegistration);
        });
    }

}
