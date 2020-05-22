package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SingUpController {

    @FXML
    private AnchorPane background;

    @FXML
    private TextField singUpSurname;

    @FXML
    private Button singin_button;

    @FXML
    private TextField singUpName;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private CheckBox singUpCheackBoxMale;

    @FXML
    private CheckBox singUpCHeckBoxFemale;


    @FXML
    private TextArea textdone;
    @FXML
    private Button admin_button;
    @FXML
    void initialize() {
        singin_button.setOnAction(event -> {
            done();
        });
    admin_button.setOnAction(actionEvent -> {

        admin_button.getScene().getWindow().hide();

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
    });}
        private void done(){


        if( !singUpName.getText().equals("")  && !singUpSurname.getText().equals("") && !login_field.getText().equals("")&&!password_field.getText().equals("")) {
            String gen="";
            if (!singUpCheackBoxMale.isSelected()) {
                if(singUpCHeckBoxFemale.isSelected()){
                    gen="Female";
                }
                else if(singUpCheackBoxMale.isSelected() && singUpCHeckBoxFemale.isSelected() )
                {
                    gen="Gender not selected";
                }
            } else {
                gen="Male";
            }
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
            final String finalGen = gen;
            String Name =singUpName.getText().trim();
            String Surname=   singUpSurname.getText().trim();
            String login =   login_field.getText().trim();
            String password =      password_field.getText().trim();

            Student student = new Student(Name,Surname,login,password,"male");
            PakageData pd =new PakageData("ADD",student);
            Main.connect(pd);

           /* DatabaseHandler.SignUpUsers( student);*/}
        else {textdone.setText("please write");}
            {




                singUpName.setText("");
                singUpSurname.setText("");
                login_field.setText("");
                password_field.setText("");






               /* singin_button.getScene().getWindow().hide();

                FXMLLoader loaderSingi4n=new FXMLLoader();
                loaderSingin.setLocation(getClass().getResource("/sample/app.file.fxml"));
                try {
                    loaderSingin.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent rootSing4In=loaderSingin.getRoot();
                Stage stageSing4in=new Stage();
                stageSingin.setScene(new Scene(rootSingIn));
                stageSingin.show();*/

//dbHandler.SignUpUsers(singUpName.getText(),singUpSurname.getText(),login_field.getText(),password_field.getText(),finalGen.toString());
            }


            }


    }

