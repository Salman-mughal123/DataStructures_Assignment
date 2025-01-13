public class printrev {
     static class Node{
        int data; Node next; Node prev;
        Node (int data){
            this.data=data;
        }

    }

    public static void print(Node head){
         Node temp=head;
         while (temp!=null){
             System.out.print(temp.data + " ");
             temp=temp.next;
         }
        System.out.println();

    }

    public static void printrev(Node head){
         Node temp=head;
         while (temp!=null){
             System.out.print(temp. data  + " ");
             temp=temp.prev;
         }
        System.out.println("");
    }
    public static void addF(Node head, int value){
         Node t= new Node(value);
         t.next=head;
         head=t;

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println();

    }

    public static void AddLast(Node head , int value){
         Node t= new Node(value);
         Node temp= head;
         while (temp.next!=null){
             temp=temp.next;
         }
         temp.next=t;
         t.prev=t;
     }

     public static void insertidx(Node head, int value, int idx){

         Node s=head;
         for (int i =0; i<idx-1; i ++){
             s=s.next;
         }
         Node t = new Node(value);
         Node r=s.next;

         s.next=t;
         t.prev=s;
         t.next=r;
         r.prev=t;

         Node temp=head;
         while (temp!=null){
             System.out.print(temp.data + " ");
             temp=temp.next;
         }
         System.out.println();
     }
public static void DleteF(Node head){
         head=head.next;
         head.prev=null;
    Node temp=head;
    while (temp!=null){
        System.out.print(temp.data + " ");
        temp=temp.next;
    }
    System.out.println();

    }

    public static void Deleteidx(Node head, int idx){
         Node temp=head;
         for (int i=0; i<idx-1; i++){
             temp=temp.next;
         }
         temp.next=temp.next.next;
         temp.next.prev=temp;

    }
    public static void main(String[] args) {

         Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);
        Node n4= new Node(6);
        n1.prev=null;
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=null;
//        print(n1);
//        printrev(n4);
//        System.out.println(" ");
//        addF(n1,40);
//
//        System.out.println(" ");
//
//        AddLast(n1, 100);
//    print(n1);

    insertidx(n1,77,3);
    DleteF(n1);
    Deleteidx(n1,2);
    print(n1);


    }
}
