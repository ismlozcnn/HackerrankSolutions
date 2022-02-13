import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AbsolutePermutation {

    public static List<Integer> absolutePermutation(int n, int k) {
        // Write your code here
        List<Integer> res=new ArrayList<>();
        Set<Integer> contains=new HashSet<>();
        if(k!=0 && (n/2)%k!=0){
            res.add(-1);
            return res;
        }
        for(int i=1;i<=n;i++){
            if(i-k>0 &&!contains.contains(i-k)){
                res.add(i-k);
                contains.add(i-k);
            }
            else{
                res.add(i+k);
                contains.add(i+k);
            }
        }
        return res;

    }


}
