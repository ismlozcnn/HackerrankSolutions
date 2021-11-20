import java.util.List;

public class RunningTimeofAlgorithms {

    public static int runningTime(List<Integer> arr) {
        // Write your code here
        int count=0;
        int tmp;
        int j;
        for (int i=1; i < arr.size(); i++) {
            tmp=arr.get(i);
            j=i-1;
            while(tmp< arr.get(j)){
                arr.set(i, arr.get(i-1));
                arr.set(i-1,tmp);
                count++;
                if(j!=0){
                    j--;
                    i--;
                }
            }
        }
        return count;
    }
}
