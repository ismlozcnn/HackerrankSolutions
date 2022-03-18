import java.util.List;

public class SherlockAndArray {

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int sum=0;
        for (int ar:arr) {
            sum+=ar;
        }
        int left=0;
        for (Integer integer : arr) {
            if (left == (sum - integer)) {
                return "YES";
            }
            left+=integer;
            sum-=integer;
        }
        return "NO";

    }
}
