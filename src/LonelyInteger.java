import java.util.Collections;
import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        for(int i=0;i<arr.size();i=i+2){
            if(i== arr.size()-1){
                return arr.get(arr.size()-1);
            }
            else if(!arr.get(i).equals(arr.get(i+1))){
                return arr.get(i);
            }

        }
        return 0;

    }
}
