package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartmen;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAcction() {
		System.out.println("onMenuItemSellerAcction");
	}
	
	@FXML
	public void onMenuItemDepartmentAcction() {
		System.out.println("onMenuItemDepartmentAcction");
	}
	
	@FXML
	public void onMenuItemAboutAcction() {
		System.out.println("onMenuItemAboutAcction");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	
	}

	
}
