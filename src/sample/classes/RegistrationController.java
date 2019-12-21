package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistrationController {

    Controller controller = new Controller();

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
        continueRegistration.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/teacherRegistration.fxml", continueRegistration)
            );
    }

}
