import java.util.*;
import java.util.stream.Collectors;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        // Write your code here
        int sum =0;
        List<Character> cc =s.chars().mapToObj(e -> (char) e).toList();
        for(int i=0;i<cc.size()-1;i++){
            if(cc.get(i)==cc.get(i+1)){
                sum++;
            }
        }
        return sum;
    }
}
