package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PatientSignUpController {

    @FXML
    private DatePicker birthDate;

    @FXML
    private Button createAccountBtn;

    @FXML
    private PasswordField email;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField password2;

    @FXML
    private Hyperlink signInHyperlink;

    @FXML
    private PasswordField username;

}
