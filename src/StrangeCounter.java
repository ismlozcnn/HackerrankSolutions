public class StrangeCounter {

    public static long strangeCounter(long t) {
        // Write your code here

        long i;
        for(i=4;i<=t;)
        {
            i = i*2+2;
        }
        return i-t;


    }
}
