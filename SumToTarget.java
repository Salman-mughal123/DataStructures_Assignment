import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

public class SumToTarget {
    public static int[] findTwoSum(int[] inputList, int target) {
    Map<Integer, Integer>VTI= new HashMap<>();
    for (int i=0; i<inputList.length;i++){
        int complement= target-inputList[i];
        if (VTI.containsKey(complement)){
            return new int[]{VTI.get(complement), i};
        }
        VTI.put(inputList[i],i);
    }
    return null;
}

    public static void main(String[] args) {
        int[] inputlist={1,5,9,7};
        int target=8;
        int [] result=findTwoSum(inputlist, target);
        if (result!=null){
            System.out.println("Indices: ["+ result[0]+ " , "+ result[1]+ "]");
        }
        else {
            System.out.println("Not found");
        }
    }
    }