import java.util.Collections;
import java.util.List;

public class MarkAndToys {

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        int sum=0;
        int j=0;
        Collections.sort(prices);
        for(int i=0;i<prices.size();i++){
            if(sum+prices.get(i)<=k){
                sum+=prices.get(i);
                j++;
            }
        }
        return j;

    }
}
