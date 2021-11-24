import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WeightedUniformStrings {



    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

        List<String> answer=new ArrayList<>();
        int sum;
        List<Integer> total=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            sum=s.charAt(i)-'`';
            total.add(sum);
            int repeat=sum;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                repeat+=sum;
                total.add(repeat);
                i++;
            }
        }
        for (int query:queries){
            if(total.contains(query)){
                answer.add("Yes");
            }else{
                answer.add("No");
            }
        }
        return answer;

    }



}
