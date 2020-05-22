package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private AnchorPane background;

    @FXML
    private Button registration_button;

    @FXML
    private ImageView eda1;

    @FXML
    private Button return_button;
    @FXML
    private TextField TEXTONE;

    @FXML
    private Button BUTMINUSONE;

    @FXML
    private Button BUTPLUSONE;

    @FXML
    private Button BUTMINUSTWO;

    @FXML
    private TextField TEXTTWO;

    @FXML
    private Button BUTMINUSTHREE;

    @FXML
    private Button BUTPLUSTHREE;

    @FXML
    private TextField TEXTFOUR;

    @FXML
    private TextField TEXTTHREE;

    @FXML
    private Button BUTMINUSFOUR;

    @FXML
    private Button BUTPLUSFOUR;

    @FXML
    private Button BUTPLUSTWO;

    @FXML
    private Button BUTPLUSFIVE;

    @FXML
    private Button BUTMINUSFIVE;

    @FXML
    private TextField TEXTFIVE;

    @FXML
    private TextField TEXTSIX;

    @FXML
    private Button BUTMINUSSIX;

    @FXML
    private Button BUTPLUSSIX;

    @FXML
    private Button BUTMINUSSEVEN;

    @FXML
    private Button BUTPLUSSEVEN;

    @FXML
    private TextField TEXTSEVEN;

    @FXML
    private Button BUTMINUSEIGHT;

    @FXML
    private Button BUTPLUSEIGHT;

    @FXML
    private TextField TEXTEIGHT;
    public void plus(TextField  art){
        String a=art.getText();
        int b=Integer.parseInt(a);
        int g=1;
        b=b+g;
        String add=Integer.toString(b);
        art.setText(add);

    }
    public void minus(TextField  art){
        String a=art.getText();
        int b=Integer.parseInt(a);
        int g=1;
        b=b-g;
        if (b<0){
            b=0;
        }
        String add=Integer.toString(b);

        art.setText(add);

    }
    @FXML

    void initialize() {
         BUTPLUSONE.setOnAction(event ->  {
             plus(TEXTONE);
         });
BUTMINUSONE.setOnAction(actionEvent -> {
    minus(TEXTONE);
});
        BUTPLUSTWO.setOnAction(event ->  {
            plus(TEXTTWO);
        });
        BUTPLUSTHREE.setOnAction(event ->  {
            plus(TEXTTHREE);
        });
        BUTPLUSFOUR.setOnAction(event ->  {
            plus(TEXTFOUR);
        });
        BUTPLUSFIVE.setOnAction(event ->  {
            plus(TEXTFIVE);
        });
        BUTPLUSSIX.setOnAction(event ->  {
            plus(TEXTSIX);
        });
        BUTPLUSSEVEN.setOnAction(event ->  {
            plus(TEXTSEVEN);
        });
        BUTPLUSEIGHT.setOnAction(event ->  {
            plus(TEXTEIGHT);
        });
        BUTMINUSTWO.setOnAction(event ->  {
            minus(TEXTTWO);
        });
        BUTMINUSTHREE.setOnAction(event ->  {
            minus(TEXTTHREE);
        });
        BUTMINUSFOUR.setOnAction(event ->  {
            minus(TEXTFOUR);
        });
        BUTMINUSFIVE.setOnAction(event ->  {
            minus(TEXTFIVE);
        });
        BUTMINUSSIX.setOnAction(event ->  {
            minus(TEXTSIX);
        });
        BUTMINUSSEVEN.setOnAction(event ->  {
            minus(TEXTSEVEN);
        });
        BUTMINUSEIGHT.setOnAction(event ->  {
            minus(TEXTEIGHT);
        });
        return_button.setOnAction(event -> {
            return_button.getScene().getWindow().hide();
            FXMLLoader loaderReturn = new FXMLLoader();
            loaderReturn.setLocation(getClass().getResource("/sample/app.file.fxml"));
            try {
                loaderReturn.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent rootReturn = loaderReturn.getRoot();
            Stage stageReturn = new Stage();
            stageReturn.setScene(new Scene(rootReturn));
            stageReturn.show();
        });
    }
}