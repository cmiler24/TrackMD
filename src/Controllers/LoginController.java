package Controllers;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Models.DataModel;
import Models.User;
import application.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class LoginController {
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private Button signInBtn;
	@FXML
	private VBox signInVBox;
	@FXML
	private RadioButton patientRadioBtn;
	@FXML
	private RadioButton nurseRadioBtn;
	@FXML
	private RadioButton doctorRadioBtn;
	@FXML
	private ToggleGroup Iama;
	
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
//				signInBtn.requestFocus();
				signInBtn.fire();
			}
		});
		
		signInBtn.setOnAction( e -> {			
			
			DataModel model = new DataModel();
			model.getUsersData();
			
			RadioButton selectedRB = (RadioButton) Iama.getSelectedToggle();
			Label selectOptionLabel = new Label("Please select an option on your left");
			selectOptionLabel.setTextFill(Color.color(1, 0, 0));
			if (selectedRB == null) {				
//				if (signInVBox.getChildren().getLast() == selectOptionL)
				signInVBox.getChildren().add(selectOptionLabel);
				return;
			}
			
			String role = selectedRB.getText();
			if (role.toLowerCase().contains("patient")) {
				role = "patient";
			}
			User user = new User(username.getText(), password.getText(), role);
			
			// redirect to correct view using role
			if (authenticateUser(user)) {
				// TODO:
				switch (role) {
				case "patient":
					ViewFactory.getViewFactoryInstance().showPatientView(e);
					break;
				case "nurse":
					ViewFactory.getViewFactoryInstance().showNurseView(e);
					break;
				case "doctor":
					ViewFactory.getViewFactoryInstance().showDoctorView(e);
					break;
				default:
					return;
				}
			}
		});
	}
	
	public boolean authenticateUser(User user)  {
		// TODO
		Path path = FileSystems.getDefault().getPath("src/Models/users.txt");
//		Path path = Paths.get("src/Models/users.txt");

		try {
			BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			String line = reader.readLine();
			String [] str = new String[3];

			while (line != null) {
				line = reader.readLine();
				if (line == null) {
					System.out.println("eof");
					reader.close();
					break;
				}
				str = line.split(",");
				
				if (str[0].equals(user.getUsername()) && str[1].equals(user.getPassword()) && str[2].matches(user.getRole())) {
					System.out.println("match");
					return true;
				};
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
}