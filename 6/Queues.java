public class Queues {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queues(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Queues queue = new Queues(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Size of queue: " + queue.size());
    }
}
