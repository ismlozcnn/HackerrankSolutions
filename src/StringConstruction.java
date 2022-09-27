import java.util.HashSet;

public class StringConstruction {

    public static int stringConstruction(String s) {
        // Write your code here
        int equal=0;
        char[] ss=s.toCharArray();
        for(int i=0;i<ss.length-1;i++){
            for(int j=i+1;j<ss.length;j++){
                if(ss[i]==ss[j]){
                    equal++;
                    break;
                }
            }
        }

        /*HashSet<Character> characterHashSet=new HashSet<>();
        for(int i=0;i<ss.length;i++){
            characterHashSet.add(ss[i]);
        }
        return characterHashSet.size();*/



        return ss.length-equal;
    }
}
