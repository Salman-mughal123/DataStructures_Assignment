import java.util.*;

public class StackUsingArray {
    int [] stack= new int[5];
    int top=-1;
    public void push(int x){

        if (isFull()){
            System.out.println("Overflow condition");
            return;
        }
        else {
            top++;
            stack[top]=x;
        }

    }
    public int size(){
        System.out.print("size of stack is : ");
        return top+1;
    }
    public void pop(){
        int item;
        if (top==-1){
            System.out.println("Underflow condition");
            return;
        }
        else {
//            item=stack[top];
            top--;
//            System.out.println("Poped value is : "+ item);

        }
    }
    public void peek(){
        int value;
        if (top==-1){
            System.out.println("Underflow condition");
        }
        value=stack[top];
        System.out.println(" this is value you pekaed in : " + value);
    }
    boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else return false;
    }

    boolean isFull(){
        if (top==stack.length-1)
            return true;
        else return false;
    }
    public void display(){
    for (int i=top; i>=0; i--){
        System.out.print(stack[i]+ " ");
    }
        System.out.println();
    }




    public static void main(String[] args) {
    StackUsingArray st= new StackUsingArray();
   st.push(5);
        st.push(2);
        st.push(3);
        st.push(6);
        st.push(100);
        st.push(100);

        System.out.println(st.isFull());//true
        System.out.println(st.isEmpty());//false




       st.pop();
        System.out.println(st.size());//4
        st.display();//100 6 3 2 5






    }
}
