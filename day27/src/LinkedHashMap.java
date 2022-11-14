public class LinkedHashMap {
    /**
     * LinkedHashMap的底层实现原理（了解)源码中:
            static class Entry<K,V>extends HashMap.Node<K,V> {
                Entry<K,V> before, after;       //能够记录添加的元素的先后顺序
                Entry(int hash,K key, V value,Node<K,V> next){
                    super( hash, key, value, next);
                    }
                }
     */

}
