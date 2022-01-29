import java.util.Collections;
import java.util.List;

public class MarcCakeWalk {

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie);
        Collections.reverse(calorie);
        long sum=0;
        for(int j=0;j<calorie.size();j++){
            sum+=Math.pow(2,j)*calorie.get(j);
        }
        return sum;


    }
}
