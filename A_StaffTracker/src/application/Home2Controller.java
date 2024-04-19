package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Home2Controller implements Initializable{
	private Stage stage;
	private AnchorPane root;
	private Scene scene;
	@FXML
    private TextField ad_firstName;

    @FXML
    private TextField addDateOfBirth;

    @FXML
    private TextField add_LastName;

    @FXML
    private AnchorPane add_account_form;

    @FXML
    private TextField add_address;

    @FXML
    private TextField add_department;

    @FXML
    private TextField add_email;

    @FXML
    private TextField add_id;

    @FXML
    private TextField add_phone;

    @FXML
    private Button add_user_data_save;

    @FXML
    private FlowPane calendar;

    @FXML
    private Label calendar_date;

    @FXML
    private VBox calender_form;

    @FXML
    private AnchorPane delete_account_form;

    @FXML
    private VBox edit_form;

    @FXML
    private Button employee_add;

    @FXML
    private Button employee_delete;

    @FXML
    private Button employee_set;

    @FXML
    private VBox home_form;

    @FXML
    private Button menu_add;

    @FXML
    private Button menu_calendar;

    @FXML
    private Button menu_delete;

    @FXML
    private Button menu_department;

    @FXML
    private Button menu_edit;

    @FXML
    private Button menu_home;

    @FXML
    private Button menu_logout;

    @FXML
    private Button menu_setting;

    @FXML
    private Button menu_work;

    @FXML
    private LineChart<?, ?> myLineChart;

    @FXML
    private PieChart myPieChart;

    @FXML
    private VBox setting_form;

    @FXML
    private VBox setting_form1;

    @FXML
    private VBox user_add_form;
    
    private void inLineChart() {
    	XYChart.Series series = new XYChart.Series();
    	series.getData().add(new XYChart.Data("Mon",8));
    	series.getData().add(new XYChart.Data("Tue",12));
    	series.getData().add(new XYChart.Data("Wed",10));
    	series.getData().add(new XYChart.Data("Thu",15));
    	series.getData().add(new XYChart.Data("Fri",12));
    	series.getData().add(new XYChart.Data("Sat",8));
    	series.getData().add(new XYChart.Data("Sun",5));
    	myLineChart.getData().addAll(series);
    	myLineChart.lookup(".chart-plot-background").setStyle("-fx-background-color:transparent;");
    	series.getNode().setStyle("-fx-stroke:gray");
    }
    
    public void button_Home() {
    	home_form.setVisible(true);
    	setting_form.setVisible(false);
    	edit_form.setVisible(false);
    	delete_account_form.setVisible(false);
    	add_account_form.setVisible(false);
    }
    public void button_Setting() {
    	home_form.setVisible(false);
    	setting_form.setVisible(true);
    	edit_form.setVisible(false);
    	delete_account_form.setVisible(false);
    	add_account_form.setVisible(false);
    }
    public void button_Edit() {
    	home_form.setVisible(false);
    	setting_form.setVisible(false);
    	edit_form.setVisible(true);
    	delete_account_form.setVisible(false);
    	add_account_form.setVisible(false);
    }
    public void button_add_account(){
    	home_form.setVisible(false);
    	setting_form.setVisible(false);
    	edit_form.setVisible(false);
    	delete_account_form.setVisible(false);
    	add_account_form.setVisible(true);
    }
    public void button_delete_account(){
    	home_form.setVisible(false);
    	setting_form.setVisible(false);
    	edit_form.setVisible(false);
    	delete_account_form.setVisible(true);
    	add_account_form.setVisible(false);
    }
    
    public void logout(ActionEvent event)throws IOException {
    	 Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
         alert.setTitle("Logout");
         alert.setContentText("Do you want to logout?");
         alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);
         alert.showAndWait().ifPresent(response -> {
             if (response == ButtonType.OK) {
            	 stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                 try {
					root = FXMLLoader.load(getClass().getResource("Login.fxml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                 scene = new Scene(root);
                 stage.setScene(scene);
                 stage.show();
             }
         });
    	
    	
    	
    }
    
    private void inPieChart() {
		ObservableList<PieChart.Data> pieCharData = FXCollections.observableArrayList(
				new PieChart.Data("1",20),
				new PieChart.Data("2",5),
				new PieChart.Data("3",15),
				new PieChart.Data("4",35),
				new PieChart.Data("5",25)
				);
		myPieChart.setData(pieCharData);
	}
    
    public void add_user_data() {
    	edit_form.setVisible(false);
    	user_add_form.setVisible(true);
    	
    }
    public void save_user_data() {
    	int id = Integer.parseInt(add_id.getText());
    	String fname = ad_firstName.getText();
    	String lname = add_LastName.getText();
    	String date = addDateOfBirth.getText();
    	String email = add_email.getText();
    	String phone = add_phone.getText();
    	String depart = add_department.getText();
    	String address = add_address.getText();
    	edit_form.setVisible(false);
    	user_add_form.setVisible(true);
    }
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		inLineChart();
		inPieChart();
	}
}
