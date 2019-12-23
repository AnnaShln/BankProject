package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistrationController {

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

    private UtilController controller = UtilController.getInstance();
    static String newPersonName;
    static String newPersonPassword;

    @FXML
    void initialize() {
        continueRegistration.setOnAction(event -> {
            newPersonName = loginRegistration.getText();
            newPersonPassword = passwordRegistration.getText();
            if (radioTeacher.isSelected()) controller.
                    openNewWindow("/sample/fxmls/teacherRegistration.fxml", continueRegistration);
            if (radioStudent.isSelected()) controller.
                    openNewWindow("/sample/fxmls/studentRegistration.fxml", continueRegistration);
        });
    }


}
