package application;
	
import java.io.IOException;

import Controllers.DoctorPortalController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Services.MessagingService;

public class Main extends Application {
	@Override
<<<<<<< HEAD
	public void start(Stage primaryStage) throws IOException {	
=======
	public void start(Stage primaryStage) throws IOException {
>>>>>>> e5add55ded6ebe9511d2cf0eee4e3889762b794b
		try {			
			FXMLLoader loginLoader =  new FXMLLoader(getClass().getResource("/Views/Login.fxml"));
			
			Scene scene = new Scene(loginLoader.load());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
//			primaryStage.setMaximized(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
