public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
        }

        public Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }
    }

    public void first(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;

        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void last(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Node getIndexValue(int index){
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            first(val);
        } else if (index == size) {
            last(val);
        } else {
            Node temp = head;
            int i;
            for (i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }

    public int deleteFirst(){
        int value = head.data;
        head = head.next;
        if(head==null){
            tail= null;
        }
        size--;
        return value;
    }

    public void deleteLast(){
        Node temp = head;
        for(int i =0;i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;

    }
    public int deletelast(){
        int value = tail.data;
        tail = null;
        return value;
    }

    public int delete(int index){
        Node prev = getIndexValue(index-2);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.last(5);
        linkedList.last(120);
        linkedList.last(10);
        linkedList.last(10);
        linkedList.last(110);
        linkedList.insert(1, 3);
        linkedList.display();
        linkedList.delete(2);
        linkedList.display();

    }
}