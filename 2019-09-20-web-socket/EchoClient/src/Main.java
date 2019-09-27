import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EchoClient echoClient = new EchoClient();
        echoClient.startConnection("127.0.0.1", 8080);

        var response = echoClient.sendMessage("Hello world!!!");
        System.out.println(response);

        response = echoClient.sendMessage("Hello 12A");
        System.out.println(response);
    }
}