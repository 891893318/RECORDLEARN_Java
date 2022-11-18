import org.testng.annotations.Test;

import java.io.*;

public class CopyFile {
    public void copyFile(String copyedPath, String copyPath){
        FileInputStream streamin = null;
        FileOutputStream streamout = null;
        BufferedInputStream bufin = null;
        BufferedOutputStream bufout = null;
        try {
            //1.实例化File
            File file = new File(copyedPath);
            File filecopy = new File(copyPath);
            //2.实例化流
                //2.1 实例化输入输出流
            streamin = new FileInputStream(file);
            streamout = new  FileOutputStream(filecopy);
                //2.2 实例化缓冲流
            bufin = new BufferedInputStream(streamin);
            bufout = new BufferedOutputStream(streamout);
            //3.文件的输入输出
            byte[] message = new byte[5];
            int len;
            //使用 bufin.read(message)，不然缓冲流则没意义
            while ((len = bufin.read(message)) != -1){
                String str = new String(message,0,len);
                System.out.println(str);
                streamout.write(message,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //4.流的关闭
            try {
                if (bufin != null)
                    bufin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufout != null)
                    bufin.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
            try {
                if (streamin != null)
                    streamin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (streamout != null)
                    streamout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test(){
       copyFile("总结.md","D:\\新建文件夹\\总结1.md");
    }
}
