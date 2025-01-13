public class ImplementationUsingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class LLStack
    {
        Node head=null;
        int size=0;
        void push (int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;

        }
        void displayrec(Node h){
            if (h==null) return;
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void display() {
            displayrec(head);
            System.out.println();

        }


        int pop(){
           if (head==null){
               System.out.println("stack is empty");
               return -1;
           }
           else{
               int x=head.data;

               head=head.next;
               size--;
               return x;

           }

        }
        int size(){
            System.out.print("Size: ");
            return size;
        }

        int peek(){
            if (head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }

        Boolean isEmpty(){
            if (size==0){
                return true;
            }
            else return false;
        }

    }


    public static void main(String[] args) {
        LLStack st= new LLStack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(80);
        System.out.println(st.size());
        st.display();
        st.pop();
        System.out.println(st.size());
        st.display();




    }
}
