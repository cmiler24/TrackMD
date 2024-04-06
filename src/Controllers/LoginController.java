package Controllers;


//import Models.User;
import application.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
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
	private Hyperlink createAccountLink;
	@FXML
	private ToggleGroup Iama;
	
	public LoginController() {
		System.out.println("Login in contructor called");
	}
	
//	@Override
	public void initialize() {	
		System.out.println("initializing");
		
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
			RadioButton selectedRB = (RadioButton) Iama.getSelectedToggle();
			if (selectedRB == null) {				
				Label selectOptionLabel = new Label("Please select an option on your left");
				selectOptionLabel.setTextFill(Color.color(1, 0, 0));
				signInHBox.getChildren().add(selectOptionLabel);
				return;
			}
			
			String role = selectedRB.getText();
			if (role.toLowerCase().contains("patient")) {
				role = "patient";
			}
//			User user = new User(username.getText(), password.getText(), role);
			
			// redirect to correct view using role
			if (authorizeUser()) {
				// TODO:
				switch (role) {
				case "patient":
//					ViewFactory.getViewFactoryInstance().showNurseView(e);
				case "doctor":
//					ViewFactory.getViewFactoryInstance().showDoctorView(e);
					break;
				case "nurse":
//					ViewFactory.getViewFactoryInstance().showLoginView(e);
					break;
				default:
					break;
				}
			}
		});
		
		createAccountLink.setOnAction(e -> {
//				ViewFactory.getViewFactoryInstance().showPatientSignUpView(e);			
		});	
	}
	
	public void authenticateUser() {
		// TODO
	}
	
	public boolean authorizeUser() {
		// check if authenticated
		return true;
	}
	
}