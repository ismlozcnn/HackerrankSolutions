import java.util.*;

public class ClosestNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        int min=2147483647;

        Collections.sort(arr);

        for (int i=1; i < arr.size(); i++) {
            min=Math.min(arr.get(i) - arr.get(i - 1), min);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.size();i++){
               if(arr.get(i)- arr.get(i-1)==min){
                   res.add(arr.get(i-1));
                   res.add(arr.get(i));

            }
        }
        return res;

    }
}
