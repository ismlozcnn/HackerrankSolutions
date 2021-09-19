public class TimeConversion {


    public static String timeConversion(String s) {

        String tt=s.substring(0,9);

        if(s.charAt(8)=='P') {
            char[] ss=new char[8];
            for(int i=0;i<s.length()-2;i++){
                ss[i]=s.charAt(i);
            }
            if(ss[0]=='1' && ss[1]=='2'){
                String kk=new String(ss);
                return kk;
            }
            else{
                ss[0]=(char)(tt.charAt(0)+1);
                ss[1]=(char)(tt.charAt(1)+2);
                String kk=new String(ss);
                return kk;
            }

        }
        if(s.charAt(8)=='A'){
            char[] ss=new char[8];
            for(int i=0;i<s.length()-2;i++){
                ss[i]=s.charAt(i);
            }
            if(ss[0]=='1' && ss[1]=='2'){
                ss[0]=(char)(tt.charAt(0)-1);
                ss[1]=(char)(tt.charAt(1)-2);
                String kk=new String(ss);
                return kk;
            }
            else{
                String kk=new String(ss);
                return kk;

            }

        }else{
            return tt;
        }
    }

}
