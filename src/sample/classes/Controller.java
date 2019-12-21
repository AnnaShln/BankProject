package sample.classes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller{

    @FXML
    private Button startRegistration;

    @FXML
    private Button signIn;

    private UtilController controller = UtilController.getInstance();

    @FXML
    void initialize() {
        startRegistration.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/registration.fxml", startRegistration)
        );

        signIn.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/mainWindow.fxml", signIn)
        );
    }
}