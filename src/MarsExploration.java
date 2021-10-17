public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i%3==1){
                if(s.charAt(i)!='O'){
                    count++;
                }
            }else{
                if(s.charAt(i)!='S'){
                    count++;
                }
            }
        }
        return count;
    }
}
