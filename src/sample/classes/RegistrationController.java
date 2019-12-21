package sample.classes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

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

    @FXML
    void initialize() {
        continueRegistration.setOnAction(event -> {
            continueRegistration.getScene().getWindow().hide();
            FXMLLoader loader1 = new FXMLLoader();
            FXMLLoader loader2 = new FXMLLoader();
            if (radioStudent.isSelected()) {
                loader1.setLocation(getClass().getResource("../sample/fxmls/studentRegistration.fxml"));
                try {
                    loader1.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader1.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            }
            if (radioTeacher.isSelected()) {
                loader2.setLocation(getClass().getResource("../sample/fxmls/teacherRegistration.fxml"));
                try {
                    loader2.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader2.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            }
        });
    }

}
