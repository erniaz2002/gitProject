package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static sample.DatabaseHandler.getAllStudents;

public class SoutList {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane background;

    @FXML
    private Button backmenu_button;

    @FXML
    private TextArea TextList;

    @FXML
    private Button ListCustomer;

    @FXML
    void initialize() {
        backmenu_button.setOnAction(event -> {
            backmenu_button.getScene().getWindow().hide();

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
            stage.show();
        });
        ListCustomer.setOnAction(event -> {


PakageData pd1 = new PakageData("LIST");
/*Main.connect(pd1);*/
String S=DatabaseHandler.getAllStudents();
TextList.appendText(S);
          /* String s=Main.perevod();
            TextList.appendText(s);*/



        });

    }
}
