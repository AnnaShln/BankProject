package sample.classes;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable{

    Controller controller = new Controller();

    @FXML
    private Button logOut;

    @FXML
    private Button registrationFromMainWindow;

    @FXML
    private Text nameInMainWindow;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        logOut.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/start.fxml", logOut)
        );

        registrationFromMainWindow.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/registration.fxml", registrationFromMainWindow)
        );
        nameInMainWindow.setText(name);
    }

    String name = "Рандомное имя";
}
