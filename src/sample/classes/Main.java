package sample.classes;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.classes.UtilController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        UtilController.getInstance().main(primaryStage);
        BankOfProjects bankOfProjects = new BankOfProjects();
        bankOfProjects.addSomePeople();
        bankOfProjects.addSomeProjects();
        bankOfProjects.addSomeProjectsToPeople();
        bankOfProjects.addSomeMembersToProjects();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
