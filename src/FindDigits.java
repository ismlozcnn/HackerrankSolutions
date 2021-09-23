import java.util.ArrayList;
import java.util.List;

public class FindDigits {

    public static int findDigits(int n) {
        // Write your code here
        int count=0;
        int temp=n;
        List<Integer> ss=new ArrayList<>();
        while(n!=0){
            if(n%10!=0){
                ss.add(n%10);
                n=n/10;
            }else{
                ss.add(n%10);
                n=n/10;
            }
        }
        for(int i=0;i<ss.size();i++){
            if (ss.get(i)!=0){
                if(temp%ss.get(i)==0){
                    count++;
                }
            }

        }
        return count;

    }
}
