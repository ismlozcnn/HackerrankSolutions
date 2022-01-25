public class SeperateTheNumbers {

    public static void separateNumbers(String s) {
        // Write your code here
        String substr="";
        boolean res=false;
        for(int i=1;i<=s.length()/2;i++){
            substr=s.substring(0,i);
            Long num=Long.parseLong(substr);
            String  compstr=substr;
            while(compstr.length()<s.length()){
                compstr =compstr+ (++num);
            }
            if(s.equals(compstr)){
                res=true;
                break;
            }
        }
        if(res){
            System.out.println("YES "+substr);
        }else{
            System.out.println("NO");
        }



    }



}
