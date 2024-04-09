package Controllers;


import java.io.FileNotFoundException;

import Models.DataModel;
import application.LoginFile;
import application.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class LoginController {
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private Button signInBtn;
	@FXML
	private HBox signInHBox;
	@FXML
	private RadioButton patientRadioBtn;
	@FXML
	private RadioButton nurseRadioBtn;
	@FXML
	private RadioButton doctorRadioBtn;
	@FXML
	private ToggleGroup Iama;
	
	public LoginController() {
//		System.out.println("Login in contructor called");
	}
	
//	@Override
	public void initialize() throws StringIndexOutOfBoundsException {	
//		System.out.println("initializing");

		username.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.ENTER) {
				password.requestFocus();
			}
		});
		password.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				signInBtn.requestFocus();
				signInBtn.fire();
			}
		});
		
		signInBtn.setOnAction( e -> {			
//			DataModel model = new DataModel();
//			model.getUsersData();
			
			RadioButton selectedRB = (RadioButton) Iama.getSelectedToggle();
			if (selectedRB == null) {				
				Label selectOptionLabel = new Label("Please select an option on your left");
				selectOptionLabel.setTextFill(Color.color(1, 0, 0));
				signInHBox.getChildren().add(selectOptionLabel);
				return;
			}
			
			String role = selectedRB.getText();
			role = role.toLowerCase(); 	
			
			//fixes poor labeling
			if(role.contains("patient")) {
				role = "patient";
			}
			// redirect to correct view using role
			try {
				if (authorizeUser(username.getText(), password.getText(), role)) {
					// TODO:
					switch (role) {
					case "patient":
					ViewFactory.getViewFactoryInstance().showPatientView(e);
					case "doctor":
					ViewFactory.getViewFactoryInstance().showDoctorView(e);
						break;
					case "nurse":
					ViewFactory.getViewFactoryInstance().showNurseEntranceView(e);
						break;
					default:
//						System.out.print(role);
						break;
					}
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}

	public boolean authorizeUser(String username, String password, String role) throws FileNotFoundException {
		// check if file exists a.k.a if authenticated
		LoginFile.getFileInstance().accessFile(username);
		
		//checks validation username and password. 
		if(username.equals(LoginFile.getFileInstance().getUserName())
			&& password.equals(LoginFile.getFileInstance().getPassword()) 
			&& role.equals(LoginFile.getFileInstance().getType())) {
				return true;
		}
		return false;
	}
	
}
