public class LL2 {
    Node head;
    public LL2(){
        
    }
    public class Node{
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
        if(head == null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void printNode(){
        Node temp = head;
        while(temp != null){
            System.out.print("temp.data"+" -> ");
        }
        System.out.println("NULL");
    }
   
    public static void main(String args[]){
       LL2 ll = new LL2();
       ll.first(21);
       ll.first(22);
       ll.first(21);
       ll.first(22);
       ll.printNode();

    }
}
