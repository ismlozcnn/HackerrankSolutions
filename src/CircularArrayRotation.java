import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int[] a2=new int[a.size()];
        k=k%a.size();
        for(int i=0;i<a.size();i++){
            a2[i]=a.get((a.size()-k+i)%a.size());
        }
        for(int j=0;j<queries.size();j++){
            queries.set(j,a2[queries.get(j)]);
        }
        return queries;

    }
}
