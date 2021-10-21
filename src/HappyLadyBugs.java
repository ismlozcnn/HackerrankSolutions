import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HappyLadyBugs {

    public static String happyLadybugs(String b) {
        // Write your code here
        boolean isTransformed=true;

        List<Character> bs=b.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        if (bs.size() == 1) {
            if (bs.get(0) != '_')
                isTransformed=false;
        } else {
            if (bs.contains('_')) {
                Collections.sort(bs);
            }
            for (int i=0; i < bs.size(); i++) {
                if (i == 0) {
                    if (bs.get(i) == bs.get(i + 1)) {
                        continue;
                    }
                    else {
                        isTransformed=false;
                        break;
                    }
                } else if (i == bs.size() - 1) {
                    if (!(bs.get(i - 1) == bs.get(i) || bs.get(i) == '_')) {
                        isTransformed=false;
                    }
                } else {
                    if (bs.get(i) == bs.get(i + 1) || bs.get(i - 1) == bs.get(i)) {
                        continue;
                    }else {
                        isTransformed=false;
                        break;
                    }
                }
            }
        }


        if (isTransformed) {
            return "YES";
        } else {
            return "NO";
        }

    }
}
