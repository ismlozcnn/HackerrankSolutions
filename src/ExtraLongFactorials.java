import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger res=BigInteger.ONE;
        if(n==1 || n==0){
            System.out.println(n);
        }else{
            for(int i=2;i<=n;i++){
                res=res.multiply(BigInteger.valueOf(i));
            }
            System.out.println(res);
        }

        //Second Way
        BigInteger ress=factorical(n);
        System.out.println(res);



    }

    public static BigInteger factorical(int n){
        if(n==1 ||n==0){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorical(n-1));

    }

}
