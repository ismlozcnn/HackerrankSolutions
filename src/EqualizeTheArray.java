import java.util.Collections;
import java.util.List;

public class EqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int maxRepeat=1;
        for(int i=0;i<arr.size();i++){
            int temp=1;
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    temp++;
                }
            }
            if(maxRepeat<temp){
                maxRepeat=temp;
            }
        }

        return arr.size()-maxRepeat;
    }

}
