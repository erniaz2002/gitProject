package sample;

import sample.DatabaseHandler;
import sample.Student;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5506);
            while (true) {
                System.out.println("Waiting for a client...");
                Socket socket = server.accept();
                System.out.println("Client connected");
                ServerThread st = new ServerThread(socket);
                st.start();

            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }
}
