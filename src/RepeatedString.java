import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here

        long tam=n/s.length();
        long son=n%s.length();


        long max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                max++;
            }
        }
        max=max*tam;
        for(int i=0;i<son;i++){
            if(s.charAt(i)=='a'){
                max++;
            }
        }

        return max;
    }
}
