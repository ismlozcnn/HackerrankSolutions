public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        // Write your code here
        int count=0;
        int t=5;

        for(int i=0;i<n;i++){
            int temp=t/2;
            t=(t/2)*3;
            count+=temp;
        }

        return count;
    }
}
