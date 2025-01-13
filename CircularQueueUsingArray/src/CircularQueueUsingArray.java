public class CircularQueueUsingArray {
    static class CQA{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr= new int[5];

        public void add(int x){
            if (size==arr.length){
                System.out.println("Queue is FULL ");
                return;
            }
            else if (size==0) {
                front=rear=0;
                arr[0]=x;
            }
            else if (rear<=arr.length-1) {
                arr[++rear]=x;
            }
            else if (rear==arr.length-1){
                rear=0;
                arr[0]=x;
            }
            size++;
        }


        public int delete(){
            if (size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            else {
                int val = arr[front];
                if (front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }
        }


        public int peek(){
            return arr[front];
        }
        public void display(){
            if (size==0){
                System.out.println("List is empty!");
                return;
            }
            else if (front<=rear){
                for (int i=front; i<=rear;i++){
                    System.out.print(arr[i]+ " ");
                }
            }
            else {
                for (int i=front; i<arr.length;i++){
                    System.out.print(arr[i]+ " ");
                }
                for (int i=0; i<=rear;i++){
                    System.out.print(arr[i]+ " ");
                }

            }
            System.out.println();
        }

        public int Size(){
            System.out.print("SIZE OF QUEUE IS:");
            return size;
        }
    }


    public static void main(String[] args) {
        CQA q= new CQA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();//1234
        q.delete();
        q.display(); // 2 3 4 5
        q.add(5);
        q.display();// 2 3 4 5













    }
}
