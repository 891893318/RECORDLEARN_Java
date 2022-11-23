import org.testng.annotations.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端发送文件给服务器，服务器接收并保存到本地,服务器接收文件并保存后，给客户端反馈成功信息
 * 注意：传送数据时read方法阻塞问题！！！socket.shutdown...();
 */
public class TcpTest2 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream os = null;
        ByteArrayOutputStream baos2 = null;
        BufferedOutputStream BOS = null;
        try {
            //1.ip和端口号
            socket = new Socket("192.168.43.189",99);
            //2.文件输入
            File file = new File("C:\\Users\\89189\\Desktop\\周杰伦 - 红颜如霜.flac");
            fis = new FileInputStream(file);
            os = socket.getOutputStream();
            BOS = new BufferedOutputStream(os);
            byte[] num = new byte[10];
            int len;
            while ((len = fis.read(num))!=-1){
                BOS.write(num,0,len);
            }
            System.out.println("传输成功！！");
            socket.shutdownOutput();

            //接受来自服务器的反馈
            InputStream is = socket.getInputStream();
            //防止出现乱码，使用ByteArrayOutputStream
            baos2 = new ByteArrayOutputStream();
            byte[] num2 = new byte[20];
            int len2;
            while ((len2 = is.read(num2))!=-1) {
                baos2.write(num2, 0, len2);
            }
            System.out.println(baos2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (baos2 != null) {
                try {
                    baos2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
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

    //服务端
    @Test
    public void severe(){
        ServerSocket ss = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            ss = new ServerSocket(99);
            Socket socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream("C:\\Users\\89189\\Desktop\\周杰伦 - 红颜如霜复制.flac");
            byte[] num = new byte[10];
            int len;
            while ((len = is.read(num))!=-1){
                fos.write(num,0,len);
            }

            //服务端给出反馈
            os = socket.getOutputStream();
            os.write("服务端已收到".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //资源关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
