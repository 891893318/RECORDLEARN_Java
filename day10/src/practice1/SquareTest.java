package practice1;

import java.util.Scanner;

public class SquareTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("输入第1个square的边长：");
      double a = scanner.nextDouble();
      System.out.println("是否可以着色（True or false）");
      boolean isa = scanner.nextBoolean();
      System.out.println("输入第2个square的边长：");
      double b = scanner.nextDouble();
      System.out.println("是否可以着色（True or false）");
      boolean isb = scanner.nextBoolean();
      System.out.println("输入第3个square的边长：");
      double c = scanner.nextDouble();
      System.out.println("是否可以着色（True or false）");
      boolean isc = scanner.nextBoolean();
      System.out.println("输入第4个square的边长：");
      double d = scanner.nextDouble();
      System.out.println("是否可以着色（True or false）");
      boolean isd = scanner.nextBoolean();
      System.out.println("输入第5个square的边长：");
      double e = scanner.nextDouble();
      System.out.println("是否可以着色（True or false）");
      boolean ise = scanner.nextBoolean();


      GeometricObject[] member = {new Square(), new Square(b,isb),
              new Square(c,isc), new Square("black", isd, d), new Square(4.5)};
      for (GeometricObject geometricObject : member) {
         System.out.println("面积是 " + geometricObject.getArea()
                 + "周长是 " + geometricObject.getPerimrter());
         if (geometricObject.isFiiled()) {
            ((Colorable) geometricObject).howToColor();
         }
      }
   }
}
