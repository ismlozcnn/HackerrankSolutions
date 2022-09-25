import java.util.List;
import java.util.stream.Collectors;

public class MakingAnagrams {

    public static int makingAnagrams(String s1, String s2) {
        // Write your code here

        List<Character> ss1=s1.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        List<Character> ss2=s2.chars().mapToObj(e->(char)e).collect(Collectors.toList());

        for(int i=0;i<ss1.size();){
            boolean equal=false;
            for(int j=0;j<ss2.size();j++){
                if(ss1.get(i).equals(ss2.get(j))){
                    ss1.remove(ss1.get(i));
                    ss2.remove(ss2.get(j));
                    equal=true;
                    break;
                }
            }
            if(!equal){
                i++;
            }
        }
        return ss2.size()+ss1.size();
    }
}
