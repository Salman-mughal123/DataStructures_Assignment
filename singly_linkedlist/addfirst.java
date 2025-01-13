class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    public void AddFirst(int data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }

    public void Addlast(int data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode;
            return;
        }

        Node currentNode=head;
        while (currentNode.next != null){
            currentNode= currentNode.next;
        }
        currentNode.next=newnode;
        newnode.next=null;


    }
    public void printlist(){
        Node currentNode= head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode=currentNode.next;
        }
        System.out.println(" ");
    }

    public void deletefirst(){
        head=head.next;
    }

    public void deletelast(){
        Node secondl=head;
        Node last=head.next;
        while (last.next != null){
            last=last.next;
            secondl=secondl.next;
        }

        secondl.next=null;


    }





}



public class addfirst {
    public static void main(String[] args) {

LL a= new LL();
a.AddFirst(3);
        a.AddFirst(2);
        a.AddFirst(1);
a.printlist();
a.Addlast(4);
a.printlist();
a.deletefirst();
a.printlist();
a.deletelast();
a.printlist();



    }
}
