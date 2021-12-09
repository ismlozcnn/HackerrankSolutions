public class FunnyStrings {

    public static String funnyString(String s) {
        // Write your code here

        String reverse=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length()-1;i++){
            int a=Math.abs(s.charAt(i)-s.charAt(i+1));
            int b=Math.abs(reverse.charAt(i)-reverse.charAt(i+1));
            if(a!=b){
                return "Not Funny";
            }

        }
        return "Funny";








    }
}
