import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 89189
 */

public class CollectionTest {
    @Test
    public void test1(){
        Collection<Object> collection =new ArrayList<>();
        Collection<Object> collection1 =new ArrayList<>();
        collection.add(123);
        collection.add("aaa");

        collection1.add(456);
        collection1.add("666");

        collection.addAll(collection1);
        System.out.println(collection.size());
        System.out.println();

        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
