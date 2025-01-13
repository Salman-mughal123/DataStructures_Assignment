public class InsertAtIndx {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public  static void print(Node head){
         Node temp= head;
         while (temp!=null){
             System.out.print(temp.data + " ");
             temp=temp.next;
         }
        System.out.println();
    }
    public static void Insert(Node head, int idx,int value){
        Node newnode= new Node(value);

        Node temp=head;
        for (int i=0 ; i<idx-1; i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;



    }

    public static void printrever(Node head){
        if (head==null) return;
        printrever(head.next);

        System.out.print(head.data+ " ");
    }



    public static void main(String[] args) {
Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);


        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        print(n1);
        Insert(n1,3,55);
        print(n1);

        printrever(n1);

    }
}
