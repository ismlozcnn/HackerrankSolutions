import java.util.List;

public class LuckBalance {

    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int sum=0;
        int maxLose=0;
        int size=contests.size();
        for(int i=0;i<contests.size();i++){
            for(int j=i+1;j<contests.size();j++){
                if(contests.get(i).get(0)<contests.get(j).get(0)){
                    List<Integer> temp=contests.get(i);
                    contests.set(i,contests.get(j));
                    contests.set(j,temp);
                }
            }
        }
        for(int i=0;i<size;i++){
            if(contests.get(i).get(1)==1){
                if(maxLose<k){
                    sum+=contests.get(i).get(0);
                    maxLose++;
                }
                else{
                    sum-=contests.get(i).get(0);
                }
            }else{
                sum+=contests.get(i).get(0);
            }
        }


        return sum;
    }
}
