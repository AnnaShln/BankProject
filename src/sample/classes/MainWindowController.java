package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainWindowController{

    Controller controller = new Controller();

    @FXML
    private Button logOut;

    @FXML
    private Button registrationFromMainWindow;

    @FXML
    void initialize() {
        logOut.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/start.fxml", logOut)
        );

        registrationFromMainWindow.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/registration.fxml", registrationFromMainWindow)
        );
    }

}
