public class CLL2 {
    Node head;
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    
    public void first(int data,Node head){
        Node newNode = new Node(data);
        if(head == null ){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return;
    }
    public void last(int data,Node head){
        Node temp = head;
        Node newNode = new Node(data);
        if(head == null ){
            head = newNode;
            return;
        }
        while(temp != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    public static void main(String args[]){
        System.out.println("hello");
    }
}
