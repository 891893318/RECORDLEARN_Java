import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public void copyFile(String copyedPath, String copyPath){
        FileInputStream streamin = null;
        FileOutputStream streamout = null;
        try {
            //1.实例化File
            File file = new File(copyedPath);
            File filecopy = new File(copyPath);
            //2.实例化流
            streamin = new FileInputStream(file);
            streamout = new  FileOutputStream(filecopy);
            //3.文件的输入输出
            byte[] message = new byte[5];
            int len;
            while ((len = streamin.read(message)) != -1){
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
