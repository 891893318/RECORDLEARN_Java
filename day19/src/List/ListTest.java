package List;

public class ListTest {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        List list = new List();

//        list.insert(node1);
//        list.insert(node2);
//        list.insert(node3);
//        list.add(node3);
        list.add(node1);

        list.display();
    }

}
