package sample.classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.util.*;

public class RegistrationController {
    ObservableList<String> availableChoices = FXCollections.observableArrayList("Студент", "Преподаватель");

    @FXML
    private ChoiceBox<String> studentOrTeacher;
    @FXML
    private void initialize() {
        studentOrTeacher.setItems(availableChoices);
    }

}
