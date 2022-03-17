import java.util.List;

public class Anagram {

    public static int anagram(String s) {
        // Write your code here
        if(s.length()%2!=0){
            return -1;
        }
        int equal=0;
        char[] c1=s.substring(0,s.length()/2).toCharArray();
        char[] c2=s.substring(s.length()/2).toCharArray();
        for (char c : c1) {
            for (int j=0; j < c2.length; j++) {
                if (c == c2[j]) {
                    equal++;
                    c2[j]='1';
                    break;
                }
            }

        }


        return c1.length-equal;
    }
}
