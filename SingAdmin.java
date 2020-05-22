package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SingAdmin {



    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button singad_button;

    @FXML
    void initialize() {
        singad_button.setOnAction(event -> {
            vhod();});
    }

    public void vhod(){
        if(login_field.getText().equals("")&& password_field.getText().equals("")){
            singad_button.getScene().getWindow().hide();

            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/MenuAd.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root=loader.getRoot();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.show();}

        }
    }
