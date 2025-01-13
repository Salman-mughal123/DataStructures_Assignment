public class searching {
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5};
        int srch=4;
        for (int i=0; i<arry.length;i++){
            if (arry[i]==srch){
                System.out.print(srch +" is at "+ i + " index");
            }
        }

    }
}
