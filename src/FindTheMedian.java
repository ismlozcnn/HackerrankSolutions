import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(arr.size()/2);

    }
}
