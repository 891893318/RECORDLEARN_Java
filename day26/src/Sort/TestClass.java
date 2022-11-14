package Sort;

import org.testng.annotations.Test;

public class TestClass {
    public TestClass() {
    }

    public void Selection(double[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;        //Attention：最小元素索引！！！
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
                double temp;
                temp = num[i];
                num[i] = num[min];
                num[min] = temp;
            }
        }
    }

    @Test
    public static void test1(){
        double[] a = new double[]{2, 3.1, 4.2, 4.3, 55, 6, 0};
        TestClass selection = new TestClass();
        selection.Selection(a);
        for (double v : a) {
            System.out.println(v);
        }
    }
}
