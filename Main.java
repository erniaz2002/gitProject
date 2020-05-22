package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main extends Application {
   public static String s="";
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Singup.fxml"));
        primaryStage.setTitle("Rahat-Lukum");
        primaryStage.setScene(new Scene(root, 700, 375));
        primaryStage.show();

    }
public static void connect(PakageData pd){
        try {
            Socket socket=new Socket("127.0.0.1",5506);
            ObjectOutputStream outputStream=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream=new ObjectInputStream(socket.getInputStream());
            if(pd.getOperationType().equals("ADD")){
                outputStream.writeObject(pd);
            }
            else if(pd.getOperationType().equals("LIST")){
                outputStream.writeObject(pd);
                PakageData infoFromServer=(PakageData)inputStream.readObject();
                /*ArrayList<Student> arrayListFromServer=DatabaseHandler.getAllStudents();

/*
                for (int i=0;i<arrayListFromServer.size();i++){
                    s=s+arrayListFromServer.get(i)+"\n";

                }
                SoutList.TextList.appendText(s);
*/

            }
            inputStream.close();
            outputStream.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
}/*
public static String perevod(){
        return s;
}*/
    public static void main(String[] args) {
        launch(args);
    }
}
