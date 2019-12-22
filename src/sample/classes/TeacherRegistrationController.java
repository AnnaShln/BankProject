package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TeacherRegistrationController {

    private UtilController controller = UtilController.getInstance();
    RegistrationController registrationController = new RegistrationController();
    BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    private TextField facultyField;

    @FXML
    private Button finishRegistration2;

    @FXML
    private TextField positionField;

    @FXML
    void initialize() {
        finishRegistration2.setOnAction(event -> {
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", finishRegistration2);
            bankOfProjects.createTeacher(registrationController.newPersonName, facultyField.getText(),
                    positionField.getText(), registrationController.newPersonPassword);
            bankOfProjects.setOnlineUser(registrationController.newPersonName,registrationController.newPersonPassword);
        });
    }
}
