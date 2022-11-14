import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MapMethord {
    /*
    Page396
        添加、删除、修改操作:
        object put(object key,object value):将指定key-value添加到(或修改)当前map对象中
        void putAll (Map m):将m中的所有key-value对存放到当前map中
        object remove(object key):移除指定key 的key-value对，并返回value
        void clear():清空当前map中的所有数据
     */
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("c",4);
        map.put("a",7);
        map.put("b",8);
        map.put("a",8);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("a",3);
        map1.putAll(map);
        System.out.println(map1);

        map.remove("a");
        System.out.println(map);
        System.out.println(map.get("d"));
        System.out.println(map.get("c"));

        System.out.println(map.containsKey("d"));
        System.out.println(map.containsKey("c"));
    }


}
