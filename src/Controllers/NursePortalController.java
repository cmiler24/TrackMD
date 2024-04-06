package Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NursePortalController {

    @FXML
    private TextArea allergiesTA;

    @FXML
    private DatePicker birthDate;

    @FXML
    private TextField bloodPressureTF;

    @FXML
    private Button findPatientBtn;

    @FXML
    private TextField firstName;

    @FXML
    private TextArea healthConcernsTA;

    @FXML
    private TextField heightTF;

    @FXML
    private ListView<?> immunizationList;

    @FXML
    private TextField lastName;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button messagePatientBtn;

    @FXML
    private Label patientName;

    @FXML
    private ListView<?> prevHealthList;

    @FXML
    private ListView<?> prevMedList;

    @FXML
    private Hyperlink registerPatientBtn;

    @FXML
    private Button saveInfoBtn;

    @FXML
    private TextField tempTF;

    @FXML
    private TextField weightTF;

    public void initialize() {	
    	
    }
}
