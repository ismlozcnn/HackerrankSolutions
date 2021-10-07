import java.util.List;

public class IntroTutorialChallenge {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int index=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==V){
                index=i;
                break;
            }
        }

        return index;
    }
}
