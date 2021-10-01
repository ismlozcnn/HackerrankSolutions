import java.util.List;

public class JumpingClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int i=2;
        if(i>c.size()){
            i--;
        }
        int count=0;
        while(i<=c.size()-1){

            if(c.get(i)==0){
                count++;
                i=i+2;
                if(i>=c.size()){
                    i--;
                }
            }else{
                i--;
            }
        }
        return count;
    }
}
