package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DoctorPortalController {

    @FXML
    private TextArea allergiesTA;

    @FXML
    private DatePicker birthDate;

    @FXML
    private TextField bloodPressureTF;

    @FXML
    private Label email;

    @FXML
    private Button findPatientBtn;

    @FXML
    private TextField firstName;

    @FXML
    private TextArea healthConcernsTA;

    @FXML
    private TextField heightTF;

    @FXML
    private ListView<?> immuList;

    @FXML
    private TextField lastName;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button messagePatientBtn;

    @FXML
    private ListView<?> newMedList;

    @FXML
    private Label patientName;

    @FXML
    private Label patientName1;

    @FXML
    private Label patientName11;

    @FXML
    private Label phoneNumber;

    @FXML
    private Button prescribeMedBtn;

    @FXML
    private ListView<?> prevHealthTA;

    @FXML
    private ListView<?> prevMedList;

    @FXML
    private TextField tempTF;

    @FXML
    private TextField weightTF;

    public DoctorPortalController() {
    	System.out.println("constructed");
    }
}
