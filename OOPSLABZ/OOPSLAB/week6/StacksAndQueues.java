class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class Queue {
    private int size;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.size = size;
        this.queueArray = new int[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element " + value);
            return;
        }
        if (rear == size - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == size) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == size);
    }
}

public class StacksAndQueues {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Peek: " + stack.peek());
        System.out.println("Stack Pop: " + stack.pop());
        System.out.println("Stack Peek: " + stack.peek());

        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue Peek: " + queue.peek());
        System.out.println("Queue Dequeue: " + queue.dequeue());
        System.out.println("Queue Peek: " + queue.peek());
    }
}
