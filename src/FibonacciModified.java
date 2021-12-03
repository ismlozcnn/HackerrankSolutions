import java.math.BigInteger;

public class FibonacciModified {

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        // Write your code here
        int i=2;
        BigInteger t3;
        BigInteger t4;
        BigInteger t5;
        t3=BigInteger.valueOf(t1);
        t4=BigInteger.valueOf(t2);
        while(i!=n){
            t5=t3.add(t4.multiply(t4));
            t3=t4;
            t4=t5;

            i++;
        }
        return t4;
    }
}
