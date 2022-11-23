import org.testng.annotations.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FuWuTest {
    @Test
    public void test()  {
        ServerSocket ss = null;
        Socket socket =null;
        OutputStream os = null;
        try {
            ss = new ServerSocket(55);
            socket = ss.accept();
            os = socket.getOutputStream();
            os.write("唱跳rap篮球".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
