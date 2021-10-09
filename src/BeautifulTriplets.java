import java.util.List;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int first= arr.get(j)-arr.get(i);
                if(first!=d) {
                    continue;
                }
                for(int k=j+1;k<arr.size();k++){
                    int second=arr.get(k)-arr.get(j);
                    if(second==d){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
