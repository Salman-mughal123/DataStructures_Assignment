import java.util.*;

public class Minimum_value {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
       Node head= null;
        public void push(int data){

            Node temp= new Node(data);
            temp.next=head;
            head=temp;
        }
        public void print(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }

        }
        public int Minmum(){
            Node temp=head;
            int min=head.data;
            while (temp!=null){
                if (temp.data<min){
                    min=temp.data;
                }
                temp=temp.next;
            }
            return min;

        }
        public int Maximum(){
            Node temp=head;
            int max= head.data;
            while (temp!=null){
                if (temp.data>max){
                    max= temp.data;
                }
                temp=temp.next;
            }
            return max;
        }





    }


    public static void main(String[] args) {

Stack st= new Stack();
st.push(9);
st.push(2);
st.push(8);
st.push(4);
st.push(5);
st.print();
        System.out.println();
        System.out.println("minmum value in stack is: "+ st.Minmum());
        System.out.println("maximum value in stack is: "+ st.Maximum());

    }
}
