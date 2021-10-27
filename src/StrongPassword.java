public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int expectedCharacter=4;
        boolean isNumber=false;
        boolean isUpper=false;
        boolean isLower=false;
        boolean isSpec=false;
        char[] pass=password.toCharArray();
        for(int i=0;i<pass.length;i++){
            if((pass[i]>47 && pass[i]<58) && !isNumber){
                expectedCharacter--;
                isNumber=true;
            }
            if((pass[i]>96 && pass[i]<123) && !isLower){
                expectedCharacter--;
                isLower=true;
            }
            if((pass[i]>64 && pass[i]<91) && !isUpper){
                expectedCharacter--;
                isUpper=true;
            }
            if((pass[i]>32 && pass[i]<48) && !isSpec){
                expectedCharacter--;
                isSpec=true;
            }
        }
        if(n+expectedCharacter>=6){
            return expectedCharacter;
        }else{
            return 6-n;
        }



    }
}
