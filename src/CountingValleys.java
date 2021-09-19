
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int result=0;
        int k=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='D'){
                k--;
            }
            else if(path.charAt(i)=='U'){
                k++;
            }
            if(path.charAt(i)=='D' && k==-1){
                result++;
            }

        }
        return result;

    }


}
