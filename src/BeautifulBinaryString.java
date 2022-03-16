public class BeautifulBinaryString {

    public static int beautifulBinaryString(String b) {
        // Write your code here
        String bbstr="010";
        int sum=0;

        for(int i=0;i<=b.length()-bbstr.length();){
            String subStr=b.substring(i,i+bbstr.length());
            if(bbstr.equals(subStr)){
                sum++;
                i=i+bbstr.length();
            }else{
                i++;
            }
        }
        return sum;

    }
}
