import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Client {
    private static Socket socket;
    private static final int PORT = 8189;
    private static String IP_ADDRESS = "localhost";
    private static BufferedReader reader;
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) {
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            reader = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            Thread messageToServer = new Thread(() -> {
                while(true){
                    try {
                        System.out.println("Введите сообщение");
                        String str = reader.readLine();
                        System.out.println("Вы: " + str);
                        out.println(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            });
            messageToServer.setDaemon(true);
            messageToServer.start();

            while (true) {
                String serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

}
        


