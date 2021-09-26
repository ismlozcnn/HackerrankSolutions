import java.util.Collections;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pair=0;
        Collections.sort(ar);
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();){
                if(ar.get(i).equals(ar.get(j))){
                    pair++;
                    ar.remove(i);
                    ar.remove(i);
                    i--;
                    break;
                }
                else{
                    break;
                }
            }
        }

        return pair;
    }
}
