package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane background;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button registration_button;

    @FXML
    private Button singin_button;

    @FXML
    private Button ButAdmin;

    @FXML
    void initialize() {

        registration_button.setOnAction(event -> {
            registration_button.getScene().getWindow().hide();

            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/singup.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root=loader.getRoot();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
        ButAdmin.setOnAction(event -> {
            ButAdmin.getScene().getWindow().hide();

            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/List.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root=loader.getRoot();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
        singin_button.setOnAction(event -> {
            singin_button.getScene().getWindow().hide();

            FXMLLoader loaderSingin=new FXMLLoader();
            loaderSingin.setLocation(getClass().getResource("/sample/app.file.fxml"));
            try {
                loaderSingin.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent rootSingIn=loaderSingin.getRoot();
            Stage stageSingin=new Stage();
            stageSingin.setScene(new Scene(rootSingIn));
            stageSingin.show();
        });
    }

    private void loginUser(String login, String password) {
    }

}
