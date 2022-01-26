import java.util.ArrayList;
import java.util.List;

public class Encryption {

    public static String encryption(String s) {
        // Write your code here
        String ss=s.replaceAll("\\s+","");
        double length=Math.sqrt(ss.length());
        int min=(int)Math.floor(length);
        int max=(int)Math.ceil(length);
        int index=0;
        if(min*max<ss.length()){
            min++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ss.length();i=i+min){
            for(int j=index;j<ss.length();j=j+max){
                sb.append(ss.charAt(j));
            }
            sb.append(" ");
            index++;
        }
        return sb.toString();
    }
}
