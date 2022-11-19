import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StreamTest {
    @Test
    public void test1(){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("test.txt");
            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            char[] message = new char[200];
            int len;
            while ((len = isr.read(message)) != -1){
                String str = new String(message,0,len);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
