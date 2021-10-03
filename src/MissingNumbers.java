import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<brr.size();j++){
                if(arr.get(i).equals(brr.get(j))){
                    brr.remove(j);
                    break;
                }

            }
        }

        List<Integer> finall = brr.stream().distinct().collect(Collectors.toList());
        Collections.sort(finall);
        return finall;
    }
}
