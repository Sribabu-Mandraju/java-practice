class Arrays {
    Node head;
    Node tail;
    public class Node {
        int data;
        Node next;

        public  Node(int val){
            this.data = val;
        }
        public Node(int val,Node next){
            this.data = val;
            this.next = next;
        }

    }

    public void first(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.first(3);
        ll.first(5);
        ll.first(5);
        ll.display();
    }
}