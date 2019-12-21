package sample.classes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    @FXML
    private Button startRegistration;

    @FXML
    private Button signIn;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        startRegistration.setOnAction(event ->
                openNewWindow("/sample/fxmls/registration.fxml", startRegistration)
        );

        signIn.setOnAction(event ->
                openNewWindow("/sample/fxmls/mainWindow.fxml", signIn)
        );
    }

    public void openNewWindow (String window, Button button) {
        button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}