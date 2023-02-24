import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 34522;

    public static void main(String[] args) {
        try (
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ваше имя: ");
            String msg = scanner.nextLine();
            String name = msg;

            output.writeUTF(msg);
            String receivedMsg = input.readUTF();

            System.out.println("Привет, " + receivedMsg);

            while (true) {
                msg = scanner.nextLine();
                output.writeUTF(msg);
                if (msg.equals("bye") || (name.equals("admin") && msg.equals("exit"))) {
                    System.out.println("Пока, " + name);
                    break;
                }
                receivedMsg  = input.readUTF();

                System.out.println(receivedMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
