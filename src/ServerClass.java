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
                    String name = msg;
                    int n = 1;

                    while (true) {
                        msg = input.readUTF();
                        if (msg.equals("bye")) {
                            System.out.println("Пока, " + name);
                            break;
                        }
                        if (name.equals("admin") && msg.equals("exit")) {
                            break;
                        }
                        output.writeUTF("Ответ сервера: " + n + " - " + msg);
                        System.out.println("Полученно сообщение: №"+ n + " - " + msg);
                        n++;
                    }
                    if (name.equals("admin") && msg.equals("exit")) {
                        System.out.println("---Сервер остановлен---");
                        break;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
