import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    private static ServerSocket server;
    private static Socket socket;
    private static final int PORT = 8189;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");

            socket = server.accept();
            System.out.println("Client connect");
            reader = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            Thread messageToClient = new Thread(() -> {
                while (true) {
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
            messageToClient.setDaemon(true);
            messageToClient.start();

            while (true) {
                String clientMessage = in.readLine();
                System.out.println("Client: " + clientMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}