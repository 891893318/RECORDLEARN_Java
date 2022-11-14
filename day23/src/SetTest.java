import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    /**
     * Set接口：储存无序的、不可重复的数据.无序性不等于随机性，以HashSet为例：1.无序：在底层数组中并非按照数组索引添加，而是根据数据的Hash值
     *         决定的。 2.不可重复：保证添加的元素按照equals()判断，不能返回 true，即相同元素只能添加一个。3.添加元素时，首先调用该元素所
     *         在类的HashCode()方法，计算出其所对应的Hash值，Hash值通过某种方法决定了该元素在数组中的位置，判断此位置是否已经有元素，若无，
     *         该元素直接添加，若有其他元素（或者已经存在以链表形式存在的其他元素），则比较添加元素与存在元素的 hash 值：若不相同，添加成功。
     *         若相同，进而需要调用添加元素所在类的 equals() 方法（将已经存在的元素作为参数传入）：若返回 true，添加失败；若返回 false，
     *         添加成功。
     *         对于添加成功的情况：添加元素和已经存在的元素以数组链表的形式存储：
     *         jdk7：添加元素繁放在数组中，指向原来的元素
     *         jdk8：原来的元素放在数组中，指向添加的元素      （七上八下）
     *      HashSet：作为Set接口的主要实现类；线程不安全的，可以存储null值（数组加链表）
     *          LinkedHashSet：作为HashSet的子类；遍历其内部数据时，可按照添加顺序遍历，在添加的同时，还维护了两个引用，记录了前一个数据和
     *          后一个数据，目的（优点）：对于频繁遍历操作，效率优于HashSet
     *      TreeSet：可以按照添加对象的指定属性，进行排序
     * <p>
     **********Set中添加数据一定要重写两个方法: hashCode() 和 equals()，并且尽可能兼容,即相等对象有相同散列码！！（Page385）********
     * <p>
     * 重写hashCode()方法：以Eclipse/IDEA为例，在自定义类中可以调用工具自动重写equals和hashCode。
     *      问题:为什么用Eclipse/IDEA复写hashCode方法，有31这个数字?
     *          1.选择系数的时候要选择尽量大的系数。因为如果计算出来的hash地址越大，所谓的“冲突”就越少,查找起来效率也会提高。（减少冲突)
     *          2.并且31只占用5bits,相乘造成数据溢出的概率较小。
     *          3.31可以由i*31== (i<<5)-1来表示,现在很多虚拟机里面都有做相关优化。（提高算法效率)
     *          4.31是一个素数，素数作用就是如果我用一个数字来乘以这个素数，那么最终出来的结果只能被素数本身和被乘数还有1来整除!(减少冲突)
     */

    @Test
    public void test1(){
        Set<Object> set = new HashSet<>();
        set.add(1);
        set.add("s");
        set.add(2);
        set.add(2);

        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
