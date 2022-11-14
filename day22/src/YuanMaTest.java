import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class YuanMaTest {

    /**
     * ArrayList 源码分析
     *    jdk7
     *      ArrayList list = new Arraylist();
     *      底层创建了容量为10的Object[]数组 elementdata.
     *      list.add(1) //elementdata[0] = new Integer(1);
     *      ...
     *      list.add(0) //如果此次添加导致底层elementdata数组容量不够，则扩容，
     *      默认情况下，扩容为原来的1.5倍，同时需要将缘由是数组中数据复制到新的数组中。
     *      建议使用带参构造器：public ArrayList (int initialCapacity)
     * <p>
     *    jdk8  (相比jdk7节省内存)
     *      ArrayList list = new Arraylist();
     *      底层创建Object[] elementdata初始化为{}，并没有创建长度为10的数组.
     *      List.add(1);//第一次调用add()时，底层才创建长度为10的数组，并将1添加到elementdata数组中
     *      ...
     *      后续与jdk7添加无异
     * <p>
     *
     * LinkedList  (双向链表) 源码分析
     *      LinkedList list = new LinkedList();
     *      内部声明了Node类型的first和last属性，默认为null.
     *      list.add(1);//将1封装到Node中，创建Node对象。
     *      其中，Node定义为:  体现了双向链表的说法
     *          private static class Node<E> {
     *              E item;
     *              Node<E> next;
     *              Node<E> prev;
     *
     *              Node(Node<E> prev, E element, Node<E> next) {
     *              this.item = element;
     *              this.next = next;
     *              this.prev = prev;
     *              }
     *          }
     * <p>
     *  List接口中的常用方法！！！ (page383)
     */

    @Test
    public void test1(){
        ArrayList<Object> list = new ArrayList<>();

        list.add(123);
        list.add("Ss");
        list.add("aaa");

        Object element =  list.get(2);

        System.out.println(element);
        System.out.println(list);

        list.add(2,4);
        System.out.println(list);

        int idex = list.indexOf("aaa");
        System.out.println(idex);

        list.set(3,5);
        System.out.println(list);

        Iterator<Object> iterator = list.listIterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
