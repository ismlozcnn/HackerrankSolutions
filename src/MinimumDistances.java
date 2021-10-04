import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        List<Integer> ex=new ArrayList<>();
        for (int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if (a.get(i).equals(a.get(j))){
                    ex.add(Math.abs(i-j));
                }
            }

        }
        if(ex.size()==0){
            return -1;
        }
        Collections.sort(ex);
        return ex.get(0);
    }
}
