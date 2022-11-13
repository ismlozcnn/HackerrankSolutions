import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here

        Collections.sort(sticks);
        List<List<Integer>> ss=new ArrayList<>();

        for(int i=0;i<sticks.size()-2;i++){
            if((sticks.get(i)>(sticks.get(i+2)-sticks.get(i+1)) ) && ( sticks.get(i+1)+ sticks.get(i+2)>sticks.get(i))){
                List<Integer> s=new ArrayList<>();
                s.add(sticks.get(i));
                s.add(sticks.get(i+1));
                s.add(sticks.get(i+2));
                ss.add(s);
            }
        }
        if(ss.size()>0){
            return ss.get(ss.size()-1);
        }else{
            return Arrays.asList(-1);
        }
    }
}
