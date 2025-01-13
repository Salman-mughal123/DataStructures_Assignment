class pc{
    Node2 head;
    int cunt=0;
    class Node2{
        int data;
        Node2 next;
        Node2(int data){
            this.data=data;
            this.next=null;
            cunt++;
  }
    }

    public void addFirst(int data){
        Node2 newnode= new Node2(data);
        if (head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }


    public void addlast(int data){
        Node2 newnode= new Node2(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node2 temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }


        temp.next=newnode;
        newnode.next=null;

    }

    public void deletefirst(){
        if (head.next==null){
            head=null;
            return;

        }
        cunt--;
        head=head.next;

    }

    public void deletelast(){
        if (head.next==null){
            head=null;
            return;
        }

        Node2 last=head.next;
        Node2 sLast=head;
        while (last.next!=null){
            last=last.next;
            sLast=sLast.next;
        }
        cunt--;
        sLast.next=null;

    }

    public int getcount(){
        return cunt;
    }



    public void print(){
        if (head== null){
            System.out.println("NULLLLLL");
        }
        Node2 temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("");
    }


}

public class parctice {
    public static void main(String[] args) {
pc LL= new pc();
LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);
        LL.print();

        LL.addlast(6);
        LL.print();

        LL.deletefirst();
        LL.print();
        LL.deletelast();
        LL.print();
        System.out.println();
        System.out.println(LL.getcount());
        LL.addlast(40);
        LL.print();
        System.out.println(LL.getcount());





    }
}
