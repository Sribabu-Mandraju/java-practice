import java.util.*;
import java.util.LinkedList;

public class StackLL {
    public LinkedList<Integer> stackll = new LinkedList<>();

    public void push(int data) {
        stackll.addLast(data);
    }

    public int pop() {
        int poped = stackll.removeLast();
        return poped;
    }

    public int peek() {
        return stackll.getLast();
    }

    public static void main(String args[]) {
        StackLL st = new StackLL();
        st.push(2);
        st.push(4);
        st.push(10);
        int y = st.pop();
        int x = st.peek();

        System.out.println(x);
    }
}
