public class MapTest {
    /**
     * 一、 Java集合可以分为两个体系：Collection和Map
     *      Collection：List，Set
     *      Map：双列数据，存储key——value对数据
     *          HashMap: 作为Map的主要实现类，线程不安全的，效率高；可以存储null的key和value
     *              LinkedHashMap：保证在遍历Map元素时可以按照添加顺序实现遍历，原因：在原有的HashMap底层结构基础上添加了一堆指针
     *              指向前一个和后一个元素。对于频繁的遍历操作，此类的效率要高于HashMap
     *          TreeMap：保证按照添加的key-value进行排序，实现排序遍历，此时考虑key的自然排序或者定制排序，底层属于红黑树！！
     *          HashTable：古老的实现类，线程安全，效率低
     *              Properties：常用来处理配置文件，key和value都是String类型。
     * <p>
     *      HaspMap底层数组+链表（jdk7）        数组+链表+红黑树（jdk8）
     * <p>
     * 二、Map结构的理解
     *    Map中的key：无序的、不可重复的，使用Set储存所有的key  ---key所在类要重写equals()和hashCode()  （以HashMap为例）
     *    Map中的value：无序的、可重复的，使用Collection1储存所有的value   ---value所在类要重写equals()
     *    一个键值对构成了一个Entry对象。
     *    Map中的entry：无序的、不可重复的，使用Set储存所有的entry
     * <p>
     * 三、HashMap的底层原理（jdk7为例）
     *     HashMap hashmap = new HashMap()；
     *     实例化后，底层创建了长度为16的数组 Entry[] table
     *     。。。。
     *     hashmap,put(key1,value1)
     *     首先，调用key1所在类的hashCode()计算key1的hash值，经过计算以后，得到在entry数组中存放位置。
     *      如果，此位置为空，此时key1-value1添加成功； ---情况1
     *      若不为空，意味着此位置存在一个或多个数据（链表形式存在），比较key1与已经存在的一个或多个数据的hash值：
     *        如果key1的hash值与已经存在的元素hash值都不相同，则key1-value1添加成功        ---情况2
     *        如果key1的hash值与已经存在某一个元素(key2-value2)的hash值相同，继续比较equals(): 调用key1所在类的equals(key2)
     *            如果equals()返回false，则key1-value1添加成功        ---情况3
     *            如果equals()返回true，使用value语句替换相同key的value值(使用value1替换value2)
     * <p>
     *     补充：关于情况2和情况3，此时key1-value1和原来的数据以链表形式存储（jdk7为例）
     *     在不断添加过程中会涉及到扩容问题，当超出临界值且要存放的位置非空时扩容，默认的扩容方式：扩容为原来容量的2倍，并将原来数据复制过来
     * <p>
     *     jdk8相较于jdk7在底层实现方面的不同:
     *     1. new HashMap():底层没有创建一个长度为16的数组
     *     2.jdk8底层的数组是:Node[],而非Entry[]
     *     3．首次调用put()方法时，底层创建长度为16的数组
     *     4. jdk7底层结构只有:数组+链表。jdk8中底层结构:数组+链表+红黑树。
     *        当数组的某一个索引位置上的元素以链表形式存在的数据个数>8且当前数组的长度〉64时，此时此索引位置上的所有数据改为使用红黑树存储。
     */
}
