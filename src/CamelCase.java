public class CamelCase {

    public static int camelcase(String s) {
        // Write your code here
        int count=0;
        char[] cc=s.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if(Character.isUpperCase(cc[i])){
                count++;
            }
        }
        count++;

        return count;
    }
}
