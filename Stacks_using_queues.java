import java.util.LinkedList;
import java.util.Queue;

public class Stacks_using_queues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Stacks_using_queues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push operation is O(1)
    public void push(int x) {
        q1.add(x);
    }

    // Pop operation is O(n)
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // The last element in q1 is the one to be popped
        int poppedElement = q1.poll();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    // Peek operation is O(n)
    public int peek() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // The last element in q1 is the one to be peeked
        int peekedElement = q1.peek();

        // Move the last element to q2
        q2.add(q1.poll());

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return peekedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Stacks_using_queues stack = new Stacks_using_queues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop()); // Output: 4
        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.pop()); // Output: 1
    }
}