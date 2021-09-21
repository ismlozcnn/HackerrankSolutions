import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int count=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<=0){
                count++;
            }
        }
        if(count>=k){
            return "NO";
        }
        return "YES";

    }
}
