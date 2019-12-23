package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TeacherRegistrationController {

    @FXML
    private TextField facultyField;

    @FXML
    private Button finishRegistration2;

    @FXML
    private TextField positionField;

    private UtilController controller = UtilController.getInstance();
    RegistrationController registrationController = new RegistrationController();
    BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        finishRegistration2.setOnAction(event -> {
            bankOfProjects.createTeacher(registrationController.newPersonName, facultyField.getText(),
                    positionField.getText(), registrationController.newPersonPassword);
            bankOfProjects.nameOnline = registrationController.newPersonName;
            bankOfProjects.setOnlineUser(registrationController.newPersonName,registrationController.newPersonPassword);
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", finishRegistration2);
        });
    }
}
