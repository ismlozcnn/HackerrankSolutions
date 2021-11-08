import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] sorted=new int[100];
        for(int i=0;i<arr.size();i++){
            sorted[arr.get(i)]++;
        }

        return Arrays.stream(sorted).boxed().collect(Collectors.toList());


    }
}
