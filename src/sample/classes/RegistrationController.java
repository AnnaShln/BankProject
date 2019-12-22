package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistrationController {

    private UtilController controller = UtilController.getInstance();
    String newPersonName;
    String newPersonPassword;

    @FXML
    private TextField loginRegistration;

    @FXML
    private PasswordField passwordRegistration;

    @FXML
    private Button continueRegistration;

    @FXML
    private RadioButton radioStudent;

    @FXML
    private RadioButton radioTeacher;

    @FXML
    void initialize() {
        continueRegistration.setOnAction(event -> {
            if (radioTeacher.isSelected()) controller.
                    openNewWindow("/sample/fxmls/teacherRegistration.fxml", continueRegistration);
            if (radioStudent.isSelected()) controller.
                    openNewWindow("/sample/fxmls/studentRegistration.fxml", continueRegistration);
            newPersonName = loginRegistration.getText();
            newPersonPassword = passwordRegistration.getText();
        });
    }


}
