package sample.classes;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class UtilController {

    private volatile Stage stage;

    private static UtilController instance;

    public static UtilController getInstance() {
        if (instance == null) {
            synchronized (UtilController.class) {
                if (instance == null) {
                    instance = new UtilController();
                }
            }
        }
        return instance;
    }

    public void openNewWindow(String window, Button button) {
        Parent page;
        try {
            page = FXMLLoader.load(getClass().getResource(window), null, new JavaFXBuilderFactory());

            Scene scene = stage.getScene();
            if (scene == null) {
                scene = new Scene(page, 1400, 750);

                stage.setScene(scene);
            } else {
                stage.getScene().setRoot(page);
            }
            stage.sizeToScene();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void main(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxmls/start.fxml"), null,
                new JavaFXBuilderFactory());
        stage = primaryStage;
        primaryStage.setTitle("Банк Проектов");
        primaryStage.setScene(new Scene(root, 1400, 750));
        primaryStage.show();
    }
}
