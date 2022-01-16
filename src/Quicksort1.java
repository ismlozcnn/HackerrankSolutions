import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quicksort1 {

    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int pivot=arr.get(0);
        int equal=arr.size()/2;

        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<pivot){
                left.add(arr.get(i));
            }else{
                right.add(arr.get(i));
            }
        }
        Collections.sort(left);
        Collections.sort(right);
        left.add(pivot);
        left.addAll(right);
        return left;

    }
}
