public class Stack {
    private int[] stack;
    private int top;
    private int capacity;
    public Stack(int cap){
        this.capacity = cap;
        stack  = new int[cap];
        top = -1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int poppedData = stack[top];
        top = top-1;
        return poppedData;
    }
    public boolean isFull(){
        return (top == capacity-1);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public void printStack(){
        int temp = top;
        for(int i = rop;i.=0;i++){
            System.out.println(stack[i]);
        }
        return;
    }

    public static void main(String args[]){
        Stack stk = new Stack(5);
        stk.push(1);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(8);
        stk.printStack();

    }
}
