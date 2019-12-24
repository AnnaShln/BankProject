package sample.classes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.util.LinkedList;
import java.util.List;
import javafx.scene.control.ComboBox;

public class AddMembersToProjectController {
    @FXML
    private Button createProjectButton;

    @FXML
    private ComboBox<String> choiceOfPersons;

    private UtilController controller = UtilController.getInstance();
    private BankOfProjects bankOfProjects = new BankOfProjects();

    @FXML
    void initialize() {
        createProjectButton.setOnAction(event ->
                controller.openNewWindow("/sample/fxmls/mainWindow.fxml", createProjectButton)
        );
        for (Person man: bankOfProjects.allPeople) choiceOfPersons.getItems().add(man.name);
    }

    public void addPersonToNewProject () {
        for (Person person: bankOfProjects.allPeople){
            if (person.name == choiceOfPersons.getValue()) {
                bankOfProjects.allProjects.get(bankOfProjects.allProjects.size()-1).addPersonToProject(person);
                person.addProjectToPerson(bankOfProjects.allProjects.get(bankOfProjects.allProjects.size()-1));
            }
            for (String newTag: bankOfProjects.allProjects.get(bankOfProjects.allProjects.size()-1).tags)
            {
                if (!(person.tags.contains(newTag)))
                {
                    person.tags.add(newTag);
                }
            }

        }
    }


}
