package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class RegisterPatientController {

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private Hyperlink findPatientLink;

    @FXML
    private TextField firstNameTF;

    @FXML
    private TextField lastNameTF;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button registerBtn;

}
