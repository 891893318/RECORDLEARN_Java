import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


//例子：客户端发信息给服务端，服务端控制台显示信息
public class TCPTest {
    //客户端
    @Test
    public void kehuduan() throws IOException {
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(inetAddress, 1234);
        OutputStream os = socket.getOutputStream();
        os.write("555555".getBytes());
        os.close();
        socket.close();
    }
    //服务端
    @Test
    public void fuwuduan() {
        ServerSocket s = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            s = new ServerSocket(1234);
            socket = s.accept();
            socket.getInputStream();
            is = socket.getInputStream();
            //不建议
//        byte[] num = new byte[20];
//        int len;
//        while ((len = is.read(num)) !=-1){
//            String s1 = new  String(num,0,len);
//            System.out.println(s1);
//        }
            baos = new ByteArrayOutputStream();
            byte[] num = new byte[20];
            int len;
            while ((len = is.read(num)) != -1) {
                baos.write(num, 0, len);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (baos != null) {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (s != null) {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}