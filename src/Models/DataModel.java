package Models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javafx.beans.property.SimpleObjectProperty;

public class DataModel {
	SimpleObjectProperty<User> currentUser = new SimpleObjectProperty<>();
//	SimpleObjectProperty<User> currentUser = 
//	MapProperty<String, > users = new MapProperty<>();
	
	public void getUsersData() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Data/Users.csv"));
			System.out.println("File");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No file found");
		}
	}
	
	public void getPatientInfoData() {
		
	}
	
	public void getPatientVisits(String patientID) {
		
	}
	
	public void getContactInformation(String patientID) {
		
	}
	public void verifyUser(User user) {
	
	}
}
