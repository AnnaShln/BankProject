package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController {

    private UtilController controller = UtilController.getInstance();

    @FXML
    private Button logOut;

    @FXML
    private Button registrationFromMainWindow;

    @FXML
    private Text nameInMainWindow;

    @FXML
    private Text textProjects;

    String name = "Рандомное имя";
    String text = "Calmness is a quality that can be cultivated and increased with practice,[7] or developed through psychotherapy.[8] It usually takes a trained mind to stay calm in the face of a great deal of different stimulation, and possible distractions, especially emotional ones. The negative emotions are the greatest challenge to someone who is attempting to cultivate a calm mind. Some disciplines that promote and develop calmness are prayer, yoga, relaxation training, breath training, and meditation. Jon Kabat-Zinn states that “Concentration is a cornerstone of mindfulness practice. Your mindfulness will only be as robust as the capacity of your mind to be calm and stable. Without calmness, the mirror of mindfulness will have an agitated and choppy surface and will not be able to reflect things with any accuracySarah Wilson recommends reducing one’s exposure to choices/decisions as a route to calmAnother term usually associated with calmness is \"peace\".[11] A mind that is at peace or calm will cause the brain to produce \"good\" hormones, which in turn give the person a stable emotional state and promote good health in every area of life, including marriage.[12] Seeing the rise in crime and diseases around the world which are more often than not the consequences of the emotions going 'out-of-control',[13] it is therefore considered beneficial for many to stay calm and cultivate it in every possible situation, especially during stressful events such as demise of a family member or failure in business.";


    @FXML
    void initialize() {
        logOut.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/start.fxml", logOut)
        );

        nameInMainWindow.setText(name);
        textProjects.setText(text);
    }


}
