package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    public BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        startRegistration.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/registration.fxml", startRegistration)
        );

        signIn.setOnAction(event -> {
            bankOfProjects.addAdmin();
            String loginText = login.getText();
            String passwordText = password.getText();
            if (!loginText.equals("") && !passwordText.equals("")) {
                bankOfProjects.setOnlineUser(login.getText(),password.getText());
            }
            controller.openNewWindow("/sample/fxmls/mainWindow.fxml", signIn);
            System.out.println(bankOfProjects.OnlineUser.name);
            System.out.println(bankOfProjects.OnlineUser.password);
        });
    }
}