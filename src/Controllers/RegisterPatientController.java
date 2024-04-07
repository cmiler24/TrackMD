package Controllers;

import application.ViewFactory;
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
    
    public  RegisterPatientController () {
    	
    }
    
    public void initialize() {
    	logOutBtn.setOnAction( e -> {
			//System.out.print("clicked");
			ViewFactory.getViewFactoryInstance().showLoginView(e);
		});
    	
    	findPatientLink.setOnAction( e -> {
			//System.out.print("clicked");
			ViewFactory.getViewFactoryInstance().showNurseView(e);
		});
    	
    	registerBtn.setOnAction( e -> {
			//System.out.print("clicked");
			ViewFactory.getViewFactoryInstance().showNurseView(e);
		});
    }
}
