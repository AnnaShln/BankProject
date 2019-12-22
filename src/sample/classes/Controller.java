package sample.classes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;
import java.util.ResourceBundle;

public class Controller{

        @FXML
    private Button signIn;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button startRegistration;

    private UtilController controller = UtilController.getInstance();
    private BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        startRegistration.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/registration.fxml", startRegistration)
        );

        signIn.setOnAction(event -> {
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", signIn);
            bankOfProjects.setOnlineUser(login.getText(),password.getText());
        }
        );
    }
}