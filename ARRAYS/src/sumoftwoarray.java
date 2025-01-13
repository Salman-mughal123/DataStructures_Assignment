public class sumoftwoarray {

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {6, 7, 8, 9, 10};
    int [] t1= new int[arr1.length];
    for(int i =0 ; i<arr1.length; i++){
      t1[i]=arr1[i]+arr2[i];
    }

    for(int i =0 ; i<t1.length; i++){
      System.out.print(t1[i]+ " ");
    }

  }
}