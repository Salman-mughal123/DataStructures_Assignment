public class FindDuplicate {
    public String findDuplicate(int[] arr) {
       int  n=arr.length;
       int expected_sum=(n-2)*(n-1)/2;
       int actualsum=0;
       for (int i=0;i<n;i++){
           actualsum+=arr[i];
       }
       int dup=  actualsum-expected_sum;
       if (dup>=0 && dup<=n-2){
           return "Duplicate number: "+ dup;
       }
       else {
            return "No duplicate found";
       }

       }

    public static void main(String[] args) {
        int[]arr={0,2,5,1,4,3,5};
        FindDuplicate f= new FindDuplicate();
        System.out.println(f.findDuplicate(arr));

    }
}