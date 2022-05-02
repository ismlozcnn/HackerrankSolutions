import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        List<Integer> uniqList=s.stream().distinct().toList();
        List<List<Integer>> possibilities=new ArrayList<>();
        for(int i=0;i<uniqList.size();i++){
            List<Integer> examples=new ArrayList<>();
            examples.add(uniqList.get(i));
            for (int j=uniqList.size()-1;j>-1;j--){
                int flag=0;
                for(int a=0;a<examples.size();a++){
                    if(!examples.get(a).equals(uniqList.get(j))){
                        int sum =examples.get(a)+uniqList.get(j);
                        if(sum%k!=0){
                            flag++;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        break;
                    }
                }
                if(flag==examples.size()){
                    examples.add(uniqList.get(j));
                }

            }
            possibilities.add(examples);
        }
        List<Integer> sizes=new ArrayList<>();
        for (List<Integer> possibility : possibilities) {
            sizes.add(possibility.size());
        }

        return Collections.max(sizes);

    }
}
