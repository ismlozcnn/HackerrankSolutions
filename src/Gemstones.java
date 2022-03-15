import java.util.List;

public class Gemstones {

    public static int gemstones(List<String> arr) {
        // Write your code here
        int res=0;
        String firstString=removeDuplicates(arr.get(0));
        char[] first=firstString.toCharArray();
        int size=arr.size()-1;
        int sum;
        for(int j=0;j<first.length;j++){
            sum=0;
            for(int i=1;i< arr.size();i++){
                if(arr.get(i).contains(String.valueOf(first[j]))){
                    sum++;
                }
            }
            if(sum==size){
                res++;
            }
        }
        return res;
    }

    public static String removeDuplicates(String s){
        String newStr="";
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            if(newStr.indexOf(cc)<0){
                newStr+=cc;
            }
        }
        return newStr;
    }
}
