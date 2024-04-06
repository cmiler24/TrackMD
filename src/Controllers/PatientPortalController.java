package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PatientPortalController {

    @FXML
    private TextField bloodPressureTF;

    @FXML
    private TextArea commentTA;

    @FXML
    private Button editContactInfoBtn;

    @FXML
    private TextField emailTF;

    @FXML
    private TextField heightTF;

    @FXML
    private Button logOutBtn;

    @FXML
    private ListView<?> messagesList;

    @FXML
    private Label patientName;

    @FXML
    private TextField phoneNumberTF;

    @FXML
    private TextArea replyTF;

    @FXML
    private Button sendBtn;

    @FXML
    private Hyperlink signUpBtn;

    @FXML
    private TextField tempTF;

    @FXML
    private ListView<?> visitsList;

    @FXML
    private TextField weightTF;

}
