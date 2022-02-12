public class TimeComplexityPrimality {

    public static String primality(int n) {
        // Write your code here
        if(n==1){
            return "Not prime";
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return "Not prime";
            }
        }
        return "Prime";
    }
}
