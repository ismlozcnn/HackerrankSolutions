public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int equal=0;
        int l1=s.length();
        int l2=t.length();
        if(l1<l2){
            for(int i=0;i<l1;i++){
                if(s.charAt(i)==t.charAt(i)){
                    equal++;
                }
                else{
                    break;
                }
            }
        }
        else{
            for(int i=0;i<l2;i++){
                if(s.charAt(i)==t.charAt(i)){
                    equal++;
                }
                else{
                    break;
                }
            }

        }
        int append=l2-equal;
        int delete=l1-equal;
        int total=append+delete;
        if(total==k){
            return "Yes";
        }
        else if(total>k){
            return "No";
        }
        else{
            int extra=k-total;
            int o=(l1-delete)+(l2-append);
            if(extra<l1 && extra%2==0){
                return "Yes";
            }
            else if(extra>=o){
                return "Yes";
            }
            else{
                return "No";
            }
        }





    }

}
