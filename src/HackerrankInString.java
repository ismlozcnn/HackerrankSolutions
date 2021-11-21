public class HackerrankInString {

    public static String hackerrankInString(String s) {
        // Write your code here
        char[] ss={'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int k=0;
        for (int i=0; i < s.length(); i++) {
            if(k==ss.length){
                break;
            }
            if (s.charAt(i) == ss[k]) {
                k++;
            }
        }
        if (k == ss.length) {
            return "YES";
        }
        return "NO";
    }
}
