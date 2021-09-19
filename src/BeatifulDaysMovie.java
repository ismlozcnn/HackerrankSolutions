public class BeatifulDaysMovie {

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here

        int x=0;
        int count=0;

        for(int a=i;a<=j;a++){
            x=Math.abs(a-reverseNumber(a));
            if(x%k==0){
                count++;
            }
        }
        return count;

    }

    public static int reverseNumber(int o){
        int m=0;
        int a=0;
        while(o%10>=0){
            m=o%10;
            o=o/10;
            if(o==0){
                a=a+m;
                break;
            }
            a=(a+m)*10;
        }
        return a;
    }

}
