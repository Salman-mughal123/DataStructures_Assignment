public class LInkedListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static class queueB{
        Node head=null;
        Node tail= null;
        int size=0;

        public void add(int val){
            Node temp= new Node(val);
            if (size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if (size==0){
                System.out.println("Queue is empty!");
                return -1;
            }

                return head.data;

        }
        public int remove(){
            if (size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x= head.data;
            head=head.next;
            size--;
            return x;

        }
        public void display(){
            if (size==0){
                System.out.println("Queue is empty");
                return;
            }
            else {
                 Node temp=head;
                 while (temp!=null){
                     System.out.print(temp.data+ " ");
                     temp=temp.next;
                 }
                System.out.println();
            }
        }
        public int size(){
            System.out.print("Size of queue is: ");
            return size;
        }
    }
    public static void main(String[] args) {
            queueB q= new queueB();
            q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.size());
        q.display();
        q.remove();
        System.out.println(q.size());
        q.display();
        q.remove();
        System.out.println(q.size());
        q.display();

    }
}
