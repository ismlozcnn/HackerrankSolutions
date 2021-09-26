import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        Collections.sort(a);
        Collections.sort(b);
        int temp;
        int ekok=1;
        int count=0;
        int m=a.get(a.size()-1);
        if(ekok>=b.get(0)){
            return count;
        }
        for(int j=2;j<=m;){
            temp=1;
            for(int i=0;i<a.size();i++){
                if(a.get(i)%j==0){
                    temp=j;
                    a.set(i,a.get(i)/j);
                }
            }
            ekok*=temp;
            if(temp==1){
                j++;
            }
        }
        if(ekok>b.get(0)){
            return 0;
        }

        for (int i=ekok;i<=b.get(0);i++){
            int q=0;
            for(int j=0;j<b.size();j++){
                if(b.get(j)%i==0){
                    q++;
                }
            }
            if(q==b.size()&&i%ekok==0){
                count++;
            }
        }
        return count;



    }
}
