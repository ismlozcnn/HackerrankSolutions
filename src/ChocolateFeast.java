public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int kalan;
        int cnt=n/c;
        n=n/c;
        while(n>=m){
             kalan=n%m;
             n=n/m;
             cnt+=n;
             n+=kalan;

        }
        return cnt;
    }
}
