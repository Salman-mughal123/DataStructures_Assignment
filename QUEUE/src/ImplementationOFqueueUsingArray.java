public class ImplementationOFqueueUsingArray {
    static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] q= new int[5];

        public void add(int val){
            if (r==q.length){
                System.out.println("queue is full");
                return;
            }
            if (f==-1){
                f=r=0;
                q[0]=val;// agar list empty ha ta bini khy tu zeroth index ty kharien ach
            }
            else {
                q[++r]=val; // { 1 , 2}
            }
            size++;

        }
        public int remove(){
            if (isEmpty()   ){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                f++;
                size--;
                return q[f-1];
            }
        }
        public int peek(){
            return q[f];
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            else return false;
        }

        public void display(){
            if (size==0){
                System.out.println("queue is empty");
                return;
            }
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(q[i] + " ");
                }
            }
            System.out.println();
        }
        public int size(){
            System.out.print("size of queue is : ");
            return size;
        }


    }

    public static void main(String[] args) {
        queueA queue= new queueA();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.size());
        queue.display();
        queue.remove();
        System.out.println(queue.size());
        queue.display();
        System.out.println(queue.peek());



    }
}
