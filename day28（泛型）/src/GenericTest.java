import org.testng.annotations.Test;

public class GenericTest {

    /**
     * 《Java核心技术卷1》Page(326~364) all
     * 1.继承规则（注意子父类）
     * 2.通配符
     *   对于像List<?>不能向其内部添加数据，除了添加null之外
     *   可以允许读取数据，其类型为Object
     *
     */
    @Test
    public void test1(){
        Generic<String> generic = new Generic<String>();
        generic.setNo1(1);
        generic.setNo2(3.3);
        generic.setNo3("aa");
        String message = generic.toString();
        System.out.println(message);

        Generic<Integer> generic1 = new Generic<>();
        generic1.setNo3(33);
        System.out.println(generic1.toString());
    }


}
