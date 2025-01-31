import java.util.Stack;

public class queue_using_twostacks {
    static class queue{
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();


        public boolean IsEmpty(){
            return s1.isEmpty();
        }


        public void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if (s1.isEmpty()){
                System.out.println("queue is emtoy");
                return -1;
            }
            return s1.pop();
        } public int peek(){
            if (s1.isEmpty()){
                System.out.println("queue is emtoy");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        queue q= new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.remove();
        q.remove();
        q.remove();
        while (!q.IsEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
