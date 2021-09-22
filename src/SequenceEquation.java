import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> ss=new ArrayList<>();
        for(int i=0;i<p.size();i++){
            for(int j=0;j<p.size();j++){
                if(i+1==p.get(j)){
                    ss.add(j+1);
                }
            }
        }
        List<Integer> kk=new ArrayList<>();
        for(int i=0;i<ss.size();i++){
            for(int j=0;j<p.size();j++){
                if(ss.get(i)==p.get(j)){
                    kk.add(j+1);
                }
            }
        }
        return kk;
    }
}
