import java.io.*;
import java.net.*;

public class ServerClass {
    private static final int PORT = 34522;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("---Сервер запущен---");
            while (true) {
                try (
                    Socket socket = server.accept();
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                ) {
                    String msg = input.readUTF();
                    output.writeUTF(msg);
                    System.out.println("К нам пришел " + msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







    public ServerClass() throws IOException {
    }
}
