public class CLL {
    Node head;
    Node tail;
    public class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
        }
        public Node(int val,Node next){
            this.data = val;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head = node;a
            tail.next = head;
        }
        
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            head = tail = node;
        }
        else{
            node.next = head;
            tail.next = node;
            tail = node;
        }
    }

    public void insert_at_position(int val,int index){
        Node node = new Node(val);
        Node current = head;
        if(head == null){
            head = tail = node;
        }
        else{
            for(int i = 1;i<index;i++){
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    public void display(){
        Node current = head;
        do{
            System.out.print(current.data + " -> " );
            current = current.next;
        }
        while(current != head);
        System.out.print("Head");
    }
    public static void main(String args[]){
        CLL cll = new CLL();
        cll.insertLast(23);
        cll.insertLast(2234);
        cll.insertLast(233);
        cll.insertLast(2200023);
        cll.display();
    }
}
