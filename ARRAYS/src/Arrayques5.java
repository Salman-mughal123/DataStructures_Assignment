public class Arrayques5 {
    public static void main(String[] args) {
        int[] arr={0};
        int mul=2;
        int [] newarray=new int[arr.length];
        for (int i=0 ; i<arr.length; i++){

            newarray[i]=arr[i]*mul;

        }


        for (int i=0 ; i<arr.length; i++){
            System.out.print(newarray[i] + " ");
        }


    }
}
