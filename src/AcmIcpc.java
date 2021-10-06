import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AcmIcpc {

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here

        List<Integer> result=new ArrayList<>();
        int res=0;
        int max=0;
        for(int i=0;i<topic.size();i++){
            for (int j=i+1;j<topic.size();j++){
                int temp=total(topic.get(i),topic.get(j));
                if(temp>max){
                    max=temp;
                     res=1;
                }
                else if(temp==max){
                    res++;
                }
            }
        }
        result.add(max);
        result.add(res);
        return result;
    }
    public static int total(String a,String b){
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1' ||b.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }


}
