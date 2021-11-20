public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] cc=s.toCharArray();
        k%=26;
        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i)=='-' ||s.charAt(i)=='.'){
                continue;
            }
            if(s.charAt(i)>64 &&s.charAt(i)<91){
                cc[i]=(char) ((cc[i]+k));
                if(cc[i]>90){
                    cc[i]%=90;
                    cc[i]+=64;
                }
            }
            if(s.charAt(i)>96 &&s.charAt(i)<123){
                cc[i]=(char) ((cc[i]+k));
                if(cc[i]>122){
                    cc[i]%=122;
                    cc[i]+=96;
                }
            }

        }

        return String.valueOf(cc);
    }
}
