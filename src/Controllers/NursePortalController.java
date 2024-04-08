package Controllers;

import java.io.IOException;

import application.ViewFactory;
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
    private TextField immunizationList;

    @FXML
    private TextField lastName;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button messagePatientBtn;

    @FXML
    private Label patientName;

    @FXML
    private TextField prevHealthList;

    @FXML
    private TextField prevMedList;

    @FXML
    private Hyperlink registerPatientBtn;

    @FXML
    private Button saveInfoBtn;

    @FXML
    private TextField tempTF;

    @FXML
    private TextField weightTF;

    public NursePortalController(){
    	System.out.print("control");
    }
    
    public void initialize() {
    	//logout button handler
    	logOutBtn.setOnAction( e -> {
			//System.out.print("clicked");
			ViewFactory.getViewFactoryInstance().showLoginView(e);
		});
    	
    	//view message
    	messagePatientBtn.setOnAction( e -> {
			//System.out.print("clicked");
			ViewFactory.getViewFactoryInstance().showMessageView(e);
		});
    	
    	//register patient
    	registerPatientBtn.setOnAction( e -> {
			//System.out.print("clicked");
			ViewFactory.getViewFactoryInstance().showRegisterPatientView(e);
		});
    }
}
