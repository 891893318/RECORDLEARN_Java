package LinkList;

public class List {
    Node head = null;           //初始化头节点，置空

    static class Node {

        static int length = 0;             //设置表长
        Node next = null;        //指向下一个节点
        int data;                //数据域

        //构造方法
        public Node(){}
        public Node(int data) {
            this.data = data;
        }
    }

    //向节点插入数据
   public void inSert(int data){
        Node node = new Node();
        if (head.next == null){
            head.next = node;
        }
        else {
            Node temp = head.next;
            head.next = node;
            node.next = temp;
        }
   }

    //输出节点数据
    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //获取表长
    public int getLength(){
        return Node.length;
    }
}


