import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceLane {

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases,List<Integer> width) {
        // Write your code here
        List<Integer> index=new ArrayList<>();
        for(int i=0;i<cases.size();i++){
            int a=cases.get(i).get(0);
            int b=cases.get(i).get(1);
            List<Integer> temp=width.subList(a,b+1);
            index.add(Collections.min(temp));

        }
        return index;


    }
}
