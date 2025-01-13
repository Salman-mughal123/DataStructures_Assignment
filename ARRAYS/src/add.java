public class add {
    public static void main(String[] args) {
        int[]arr={0,1,3,4,5,6};
        int[] newarray=new int[arr.length+1];
        int add=2;
        int idx=2;
        for (int i=0 ; i<=idx-1; i++){
            newarray[i]=arr[i];
        }
        newarray[idx]=add;
        for (int i=idx+1; i<newarray.length;i++){
            newarray[i]=arr[i-1];
        }
        for (int i=0; i<newarray.length;i++){
            System.out.print(newarray[i] + " ");
        }




    }
}
