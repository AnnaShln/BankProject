package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller{

    @FXML
    private Button signIn;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button startRegistration;

    @FXML
    private Text errorText;

    private UtilController controller = UtilController.getInstance();
    public BankOfProjects bankOfProjects = new BankOfProjects();


    @FXML
    void initialize() {
        bankOfProjects.addSomePeople();
        bankOfProjects.addSomeProjects();
        bankOfProjects.addSomeProjectsToPeople();
        bankOfProjects.addSomeMembersToProjects();
        startRegistration.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/registration.fxml", startRegistration)
        );
    }

    public void signingIn () {
        String loginText = login.getText();
        String passwordText = password.getText();
        for (Person man: bankOfProjects.allPeople) {
            if (loginText.equals(man.name) && passwordText.equals(man.password)) {
                bankOfProjects.setOnlineUser(loginText, passwordText);
                bankOfProjects.nameOnline = bankOfProjects.OnlineUser.name;
                controller.openNewWindow("/sample/fxmls/mainWindow.fxml", signIn);
            } else errorText.setVisible(true);
        }
    }

}