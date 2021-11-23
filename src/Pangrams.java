public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        String m;
        m=s.replace(" ", "");
        m=m.toLowerCase();

        int[] arr=new int[26];
        int k;
        for(int i=0;i<m.length();i++){
            k=m.charAt(i)-'a';
            arr[k]++;
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]==0){
                return "not pangram";
            }
        }

        return "pangram";
    }
}
