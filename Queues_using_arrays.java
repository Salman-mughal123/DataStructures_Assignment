public class Queues_using_arrays {
    static class Queue{
        int rear=-1;
        int front=-1;
        int size;
        int arr [];
        int temp=0;

        Queue(int size){
            arr=new int[size];
            this.size=size;
        }

        public boolean isEmpty(){
            return front==-1;
        }

        public void add(int data){
            if (rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()){
                front=rear=0;
                arr[front]=data;
            }
            else {
                ++rear;
                arr[rear]=data;
            }
            temp++;
        }

        public int delete(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            temp--;
            return arr[front-1];
        }

        public int peek(){
            return arr[front];
        }

        public int getSize(){
            return temp;
        }
        public void display(){
            if (isEmpty()){
                System.out.println("list is emtpy");
            }
            else
                for (int i=front; i<=rear; i++){
                    System.out.print(arr[i]+ " ");
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(6);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.display();
        q.delete();
        q.display();
    }
}
