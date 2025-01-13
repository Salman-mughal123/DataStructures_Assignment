public class delete {
    public static void main(String[] args) {
       int[ ]arr={1,2,3,4,5};
        int idx=2;
        int[] newarray= new int[arr.length-1];
        for(int i=0 ; i<=idx-1; i++){
            newarray[i]=arr[i];
        }
        for(int i=idx+1; i<arr.length;i++){
            newarray[i-1]=arr[i];
        }
        for(int i =0; i<newarray.length; i++){
            System.out.print(newarray[i]+ " ");
        }


    }
}
