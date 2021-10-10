import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {

    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> index=new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j< arr.size();j++){
                if(arr.get(i)+ arr.get(j)==m){
                    flag=true;
                    index.add(i+1);
                    index.add(j+1);
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return index;




    }

}
