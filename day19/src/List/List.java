package List;

public class List {
    Node head = new Node(0);

    //添加
    //  1.。。NullPointerException？？？？
    public void add(Node node){
        Node temp = head.next;
        //循环找到最后一个节点
        while (true) {
            if (temp == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        temp = node;
    }
    //2.。
    public void insert(Node node) {
        Node temp = head;
        //循环找到最后一个节点
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        temp.next = node;
    }

    //输出节点信息
    public void display() {
        if (head.next == null) {
            System.out.println("null");
        } else {
            Node temp = head.next;
            while (true){
                if(temp == null){
                    break;
                }
                else {
                    System.out.println(temp.data);
                    //后移next指针
                    temp = temp.next;
                }
            }
        }
    }
}


//节点
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}