import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManasaAndStones {

    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here
        List<Integer> totals=new ArrayList<>();
        int tt;
        for(int i=0;i<n;i++){
            tt=(i*a)+(n-1-i)*b;
            if(!totals.contains(tt)){
                totals.add(tt);
            }
        }
        Collections.sort(totals);

        return totals;
    }
}
