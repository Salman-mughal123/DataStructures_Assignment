public class GetMinimum {
    static class Node{
        Node next;
        int data;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
        Node head=null;
        Node tail=null;

        public boolean ISEmpty(){
            return head==null && tail==null;
        }
        public void add(int data){
            Node newNode= new Node(data);
            if (ISEmpty()){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail= newNode;
        }

        public int remove(){
            if (ISEmpty()){
                return -1;
            }
            int r= head.data;;
            head= head.next;
            return r;
        }

        public int peek(){
            return head.data;
        }
        public int GetMinimum(){
            if (ISEmpty()){
                return -1;
            }
            Node temp=head;
            int min=head.data;
            while (temp!=null){
                if (min> temp.data){
                    min= temp.data;
                }
                temp=temp.next;
            }
            return min;
        }


    }

    public static void main(String[] args) {
        Queue q1= new Queue();
        q1.add(11);
        q1.add(55);
        q1.add(90);
        q1.add(10);
        q1.add(87);
        q1.add(69);
        q1.add(77);

        System.out.println("Minimum value is : " + q1.GetMinimum());

        while (!q1.ISEmpty()){
            System.out.print(q1.peek()+ " ");
            q1.remove();
        }

    }
}
