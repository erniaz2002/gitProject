package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private AnchorPane background;

    @FXML
    private ImageView image_button_home;

    @FXML
    private Button otzyvy_button;

    @FXML
    private Button contactus_button;

    @FXML
    private Button zakaz_button;

    @FXML
    private Button menu_button;

    @FXML
    void initialize() {
   menu_button.setOnAction(event -> {
       menu_button.getScene().getWindow().hide();
       FXMLLoader loaderMenu=new FXMLLoader(); 
       loaderMenu.setLocation(getClass().getResource("/sample/menu.fxml"));
       try {
           loaderMenu.load();
       } catch (IOException e) {
           e.printStackTrace();
       }
       Parent rootMenu=loaderMenu.getRoot();
       Stage stageMenu=new Stage();
       stageMenu.setScene(new Scene(rootMenu));
       stageMenu.show();
   });

    }
}
