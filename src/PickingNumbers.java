import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int sum=0;

        for(int i=0;i<a.size();i++){
            int count=1;
            for(int j=i+1;j<a.size();j++){
                if(a.get(j)-a.get(i)<=1){
                    count++;
                }else{
                    break;
                }

            }
            if(sum<count){
                sum=count;
            }

        }
        return sum;

    }
}
