import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here

        Set<Character> st=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            st.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(st.contains(s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";

        /*for (int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    return "YES";
                }
            }
        }
        return "NO";*/

    }
}
