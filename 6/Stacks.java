public class Stacks {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stacks(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1; 
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow! Cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Stack is empty.");
            return -1; 
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(5); 

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Size of stack: " + stack.size());
    }
}
