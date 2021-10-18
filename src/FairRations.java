import java.util.List;

public class FairRations {

    public static String fairRations(List<Integer> b) {
        // Write your code here
        Integer count=0;
        boolean flag=false;

        for(int i=0; i < b.size(); i++) {
            if (i==b.size()-1){
                if(b.get(i)%2==0){
                    flag=true;
                    break;
                }
                else{
                    break;
                }
            }
            if(b.get(i)%2==1){
                b.set(i,b.get(i)+1);
                b.set(i+1,b.get(i+1)+1);
                count+=2;
            }

        }
        if (flag){
            return count.toString();
        }else{
            return "NO";
        }


    }

}
