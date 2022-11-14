package practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPrTest {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        ExceptionPr exceptionPr = new ExceptionPr();
        try (Scanner scanner = new Scanner(System.in)) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.println(exceptionPr.cx(x,y));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println(".");
            e.printStackTrace();
        }

    }

}
