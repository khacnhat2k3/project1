package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AllerMessage {
	
	private Alert myAlert;
	
	public void errorMessage(String message) {
		myAlert = new Alert(AlertType.ERROR);
		myAlert.setTitle("Error Message");
		myAlert.setHeaderText(null);
		myAlert.setContentText(message);
		myAlert.showAndWait();
	}
	
	public void successMessage(String message) {
		myAlert = new Alert(AlertType.INFORMATION);
		myAlert.setTitle("Error Message");
		myAlert.setHeaderText(null);
		myAlert.setContentText(message);
		myAlert.showAndWait();
	}
	
}
