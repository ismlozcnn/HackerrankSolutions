import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort2 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int max=Collections.max(arr);
        int[] arr_=new int[++max];
        arr.forEach(integer -> arr_[integer]++);

        List<Integer> sorted=new ArrayList<>();
        for(int i=0;i<arr_.length;){
            if(arr_[i]!=0){
                sorted.add(i);
                arr_[i]--;
            }else{
                i++;
            }

        }

        return sorted;

    }
}
