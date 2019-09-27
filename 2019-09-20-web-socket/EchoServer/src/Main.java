import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        EchoServer echoServer = new EchoServer();
        try {
            echoServer.start(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            echoServer.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}