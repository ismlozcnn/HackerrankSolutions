import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        HashMap<Integer,Integer> ordered=new HashMap<>();
        List<Integer> playerOrder=new ArrayList<>();
        int index=1;
        for(int i=0;i<ranked.size();i++){
            if(!ordered.containsValue(ranked.get(i))){
                ordered.put(index++,ranked.get(i));
            }
        }
        int control=ordered.size();

        int o=1;
        for(int score:player){
            boolean flag=false;
            for(int i=control;i>0;i--){
                if(score==ordered.get(i)){
                    playerOrder.add(i);
                    flag=true;
                    break;
                }
                else if(score<ordered.get(i)){
                    i++;
                    playerOrder.add(i);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                playerOrder.add(o);
            }
        }

        return playerOrder;

    }

}
