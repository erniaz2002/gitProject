package sample;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread
{
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket=socket;
    }
    public void run(){
        try {
            DatabaseHandler databaseHandler=new DatabaseHandler();
            databaseHandler.connect();
            ObjectOutputStream outputStream=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream=new ObjectInputStream(socket.getInputStream());
            PakageData pakageData=null;
            while ( (pakageData=(PakageData)inputStream.readObject())!=null ){
                if(pakageData.getOperationType().equals("ADD")){/// "ADD", Student
                    Student studentFromClient = pakageData.getStudent();
                    databaseHandler.SignUpUsers(studentFromClient);
                }
                else if(pakageData.getOperationType().equals("LIST")){
                    ArrayList<Student> infoForClient;/*
                    infoForClient= databaseHandler.getAllStudents();
                    PakageData toClient = new PakageData(infoForClient);
                    outputStream.writeObject(toClient);
*/
                }
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
