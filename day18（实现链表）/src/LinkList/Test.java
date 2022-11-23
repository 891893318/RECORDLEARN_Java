package LinkList;

public class Test {
    public static void main(String[] args) {
        List list = new List();
        list.inSert(3);
        list.inSert(4);
        list.printNode();
        System.out.println("表长为：" + list.getLength());
    }
}
