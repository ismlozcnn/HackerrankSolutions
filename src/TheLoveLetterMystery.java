public class TheLoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int operations=0;
        int size=s.length() - 1;

        for (int i=0; i < s.length() / 2; i++) {
            operations+=Math.abs (s.charAt(size--) - s.charAt(i));
        }


        return operations;
    }
}
