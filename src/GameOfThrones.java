import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GameOfThrones {

    public static String gameOfThrones(String s) {
        // Write your code here

        HashMap<Character, Integer> cc=new HashMap<>();
        for (int i=0; i < s.length(); i++) {
            if (!cc.containsKey(s.charAt(i))) {
                cc.put(s.charAt(i), 1);
            } else {
                int k=cc.get(s.charAt(i));
                cc.put(s.charAt(i), ++k);
            }
        }
        int tek=0;
        for (Integer i : cc.values()) {
            if (i % 2 != 0) {
                tek++;
            }
        }
        if (tek > 1) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
