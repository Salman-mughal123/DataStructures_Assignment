


public class REVERSE {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void print(Node head){
       Node temp=head;
       while (temp!=null){
           System.out.print(temp.data + " -> ");
           temp=temp.next;
       }
        System.out.println("null");
    }

    public static void reverse(Node head) {
        if (head==null) return;
        reverse(head.next);
        System.out.print(head.data + " ");

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
    reverse(n1);
    }
}
