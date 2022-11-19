import org.testng.annotations.Test;

import java.io.*;

public class ObjectStreamTest {
    @Test
    public void test1() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
        oos.writeObject(new Person("你干嘛~哈哈~哎哟~", 2.5,"篮球，背带裤"));
        oos.flush();
        oos.close();
    }
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
        Person p = (Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }
}
