package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class HomeController {
    @FXML
    private Button login_button;

    @FXML
    private TextField login_email;

    @FXML
    private PasswordField login_password;

    @FXML
    private CheckBox login_remember;

    @FXML
    private Label login_warning_email;

    @FXML
    private Label login_warning_password;

    private Stage stage;
    private AnchorPane root;
    private Scene scene;

    @FXML
    public void login(ActionEvent event) throws IOException {
        String email = login_email.getText();
        String password = login_password.getText();

        if (email.isEmpty() && password.isEmpty()) {
            login_warning_email.setText("Please type your email");
            login_warning_password.setText("Please type your password");
            login_warning_email.setVisible(true);
            login_warning_password.setVisible(true);
        } else if (email.isEmpty()) {
            login_warning_email.setText("Please type your email");
            login_warning_email.setVisible(true);
        } else if (password.isEmpty()) {
            login_warning_password.setText("Please type your password");
            login_warning_password.setVisible(true);
        } else if (!email.equals("aaa@utc.edu.vn") || !password.equals("123")) {
            login_warning_email.setText("Please type correct your email");
            login_warning_password.setText("Please type correct your password");
            login_warning_email.setVisible(true);
            login_warning_password.setVisible(true);
        } else {
            login_warning_email.setVisible(false);
            login_warning_password.setVisible(false);
            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("demo.fxml"));
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    public void toggleShowPassword(ActionEvent event) {
        if (login_remember.isSelected()) {
            login_password.setPromptText("");
            login_password.setDisable(false);
            login_password.setVisible(true);
        } else {
            login_password.setPromptText("Password");
            login_password.setDisable(true);
            login_password.setVisible(false);
        }
    }
}