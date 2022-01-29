import java.util.HashMap;
import java.util.Map;

public class TheTimeWords {


    public static String timeInWords(int h, int m) {
        // Write your code here
        Map<Integer,String> res=new HashMap<>();

        res.put(1, "one");
        res.put(2, "two");
        res.put(3, "three");
        res.put(4, "four");
        res.put(5, "five");
        res.put(6, "six");
        res.put(7, "seven");
        res.put(8, "eight");
        res.put(9, "nine");
        res.put(10, "ten");
        res.put(11, "eleven");
        res.put(12, "twelve");
        res.put(13, "thirteen");
        res.put(14, "fourteen");
        res.put(15, "quarter");
        res.put(16, "sixteen");
        res.put(17, "seventeen");
        res.put(18, "eighteen");
        res.put(19, "nineteen");
        res.put(20, "twenty");
        res.put(21, "twenty one");
        res.put(22, "twenty two");
        res.put(23, "twenty three");
        res.put(24, "twenty four");
        res.put(25, "twenty five");
        res.put(26, "twenty six");
        res.put(27, "twenty seven");
        res.put(28, "twenty eight");
        res.put(29, "twenty nine");
        res.put(30, "half");

        StringBuilder sb =new StringBuilder();
        if(m==0){
            sb.append(res.get(h));
            sb.append(" o' clock");

        }
        if(m==15 ||m==30){
            sb.append(res.get(m));
            sb.append(" past ");
            sb.append(res.get(h));
        }
        else if(m>1 && m<30){
            sb.append(res.get(m));
            sb.append(" minutes");
            sb.append(" past ");
            sb.append(res.get(h));
        }
        else if(m==1){
            sb.append(res.get(m));
            sb.append(" minute");
            sb.append(" past ");
            sb.append(res.get(h));
        }
        if(m>30){
            m=60-m;
            if(m==15){
                sb.append(res.get(m));
                sb.append(" to ");
                sb.append(res.get(h+1));

            }else{
                sb.append(res.get(m));
                sb.append(" minutes");
                sb.append(" to ");
                sb.append(res.get(h+1));
            }

        }

        return sb.toString();
    }
}
