import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class KeHuTest {
    @Test
    public void test() {
        InetAddress ip = null;
        try {
            ip = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try {
            Socket socket = new Socket(ip,55);
            InputStream is = socket.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] num = new byte[20];
            int len;
            while ((len = is.read(num)) != -1){
                baos.write(num, 0 ,len);
            }
            System.out.println(baos);
            System.out.println("来自服务器：" + socket.getInetAddress().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


