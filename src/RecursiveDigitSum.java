import java.math.BigInteger;

public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {
        // Write your code here
        /*long sum=0;
        for(int i=0;i<n.length();i++)
            sum = sum + Character.getNumericValue(n.charAt(i));
        sum = sum * k;
        if(sum>=10)
            sum = superDigit(Long.toString(sum),1);
        return (int)sum;*/
        long number=Long.parseLong(n);
        long sum1=0;
        while(number%10!=0 || number/10!=0){
            long num=number%10;
            sum1+=num;
            number/=10;
        }
        sum1*=k;
        long res=0;
        while(sum1%10!=0 || sum1/10!=0){
            long num=sum1%10;
            res+=num;
            sum1/=10;
            if(res>9){
                sum1=res;
                res=0;
            }
        }

        return (int)res;
    }
}
