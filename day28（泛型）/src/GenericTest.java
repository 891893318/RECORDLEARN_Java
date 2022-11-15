import org.testng.annotations.Test;

public class GenericTest {
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
