package Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NurseEntrancePortalController {
	
	private Stage primaryStage;

    @FXML
    private Button existingPatientBtn;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button newPatientBtn;

    @FXML
    private Label patientNameLabel;

    @FXML
    private Button viewMessagesBtn;
    
    
    public void initialize() {	
    	
    }
}
