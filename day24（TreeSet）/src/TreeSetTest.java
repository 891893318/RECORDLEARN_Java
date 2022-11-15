import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    /**
     * TreeSet：可以按照添加对象的指定属性，进行排序
     * 1.向TreeSet中添加数据，必须是相同类的对象
     * 2.两种排序方式：自然排序 和 定制排序
     *      自然排序(实现Compare接口)：比较两个对象是否相同的标准为compareTo()返回0，不再是equals()
     *      定制排序：比较两个对象是否相同的标准为compare()返回0,不再是equals()
     */
    @Test
    public void test1(){
        TreeSet<Object> tree = new TreeSet<>();

        //添加数据必须是同一个类的对象
        //否则ava.lang.ClassCastException
        tree.add(new Person("Tom",47));
        tree.add(new Person("Jerry",36));
        tree.add(new Person("T",4));
        tree.add(new Person("M",3));
        tree.add(new Person("Tom",48));

        Iterator<Object> iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    //定制排序
    @Test
    public void test2(){
        Comparator<Object> com = (o1, o2) -> {
            if (o1 instanceof Person person1 && o2 instanceof Person person2){
                return Integer.compare((int) person1.getAge(), (int) person2.getAge());
            }else {
                throw  new RuntimeException("类型不匹配");
            }

        };
        TreeSet<Object> tree = new TreeSet<Object>(com);
        tree.add(new Person("Tom",47));
        tree.add(new Person("Jerry",36));
        tree.add(new Person("T",4));
        tree.add(new Person("M",4));
        tree.add(new Person("Tom",0));

        Iterator<Object> iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
