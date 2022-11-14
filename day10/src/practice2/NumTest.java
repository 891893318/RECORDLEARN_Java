package practice2;

import java.util.Arrays;

/**
 * @author 89189
 */
public class NumTest {
    public static void main(String[] args) {

        int[] num = {6,3,4,5,3,7,34,77,0};

        Num num1 = new Num();
        num1.orderNum(num);
        System.out.println(Arrays.toString(num));
    }
}
