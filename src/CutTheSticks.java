import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> ss=new ArrayList<>();
        int temp;
        Collections.sort(arr);
        while(arr.size()!=0){
            ss.add(arr.size());
            temp=arr.get(0);
            for(int i=0;i<arr.size();i++){
                arr.set(i,arr.get(i)-temp);
            }
            for(int h=0;h<arr.size();h++){
                if(arr.get(h)==0){
                    arr.remove(h);
                    h=-1;
                }
            }
        }
        return ss;
    }
}
