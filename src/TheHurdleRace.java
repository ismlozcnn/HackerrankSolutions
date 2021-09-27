import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height);
        int max=height.get(height.size()-1);
        if(max>k){
            return max-k;
        }else{
            return 0;
        }




    }
}
