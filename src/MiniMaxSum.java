import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min=0;
        long max=0;
        for(int i=0;i<arr.size()-1;i++){
            min+=arr.get(i);
        }
        for(int i=1;i<arr.size();i++){
            max+=arr.get(i);
        }

        System.out.print(min +" "+max );

    }
}
