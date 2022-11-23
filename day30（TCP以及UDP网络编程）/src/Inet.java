import org.testng.annotations.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {
    @Test
    public void test1(){
        try {
            InetAddress inet = InetAddress.getByName("localhost");
            System.out.println(inet);
             System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
