import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    @Test
    public void test1() throws IOException {
        FileReader reader = null;
        try {
            File file1 = new File("file1.txt");
            file1.createNewFile();
            reader = new FileReader(file1);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if( reader != null)
                    reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @Test

    //read(char[] cbuf: 返回每次读入到数组中的字符个数)
    public void test2() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("file1.txt");
            fr = new FileReader(file);
            char[] message = new char[5];
            int len;
            while ((len = fr.read(message)) != -1){
                for (int i = 0; i < len; i++) {
                    System.out.print(message[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            assert fr != null;
            fr.close();
        }
    }

    @Test
    public void writeTest() throws IOException {
        File file = new File("file1.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("abcdefjhijk");
        writer.close();

        FileReader fileReader = null;
        File fileout = new File("fileout.txt");
        fileout.createNewFile();
        try {
            fileReader = new FileReader(file);
            char[] message = new char[5];
            int len;
            while ((len = fileReader.read(message)) != -1){
                for (int i = 0; i < len; i++) {
                    System.out.print(message[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            assert fileReader != null;
            fileReader.close();
        }

    }
}
