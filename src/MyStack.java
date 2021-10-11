import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;

public class MyStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();


    public void push(int element) {
        stack.push(element);

        if (minStack.isEmpty()) {
            minStack.push(element);
            return;
        }
        if (element <= minStack.peek()) {
            minStack.push(element);
            return;
        }
    }

    public int peek() {
        return stack.peek();
    }

    public void pop() {
        if (minStack.peek().equals(stack.pop())) {
            int removeElement = minStack.pop();
            System.out.println("Element removed -> " + removeElement);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getMinimum() {
        return minStack.peek();
    }

}