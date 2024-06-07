public class DLL {
    Node head;
    Node tail;
    int size;

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int val) {
            this.data = val;
            this.next = null;
            this.prev = null;
        }

        public Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }

        public Node(int val, Node next, Node prev) {
            this.data = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            head.prev = node;
            node.next = head;
            node.prev = null;
            head = node;
        }
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        return val;
    }
    public int deleteLast(){
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public int delete_at_position(int pos){
        Node temp = head;
        for(int i =1;i<pos;i++){
            temp = temp.next;
        }
        int val = temp.data;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        return val;
    }

    public void insert_At_position(int val, int index) {
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" NULL ");
    }

    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.print(" NULL ");
    }

    public static void main(String args[]) {
        DLL dll = new DLL();
        dll.insertFirst(2);
        dll.insertFirst(4);
        dll.insertFirst(445);
        dll.insertFirst(453);
        dll.insertFirst(433);
        dll.insertFirst(343);
        dll.insertFirst(33);
        dll.display();
        System.out.println();
        dll.delete_at_position( 2);
        dll.display();
    }
}
