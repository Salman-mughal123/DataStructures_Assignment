import java.util.*;

public class ReverseFirstKElement {
    public static void ReverseQ(Queue<Integer>queue, int k){
        if (queue.isEmpty() || k==0 || k> queue.size() ){
            return;
        }
        Stack<Integer> st = new Stack<>();
        for (int i=0; i< k; i++){
            st.push(queue.poll());
        }

        while (!st.isEmpty()){
            queue.add(st.pop());
        }

        for (int i=0; i<queue.size()-k; i++){
            queue.add(queue.poll());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        System.out.println();
        ReverseQ(queue, 3);
        System.out.println("Queue after reversing first K Elements: "+ queue);
    }
}
