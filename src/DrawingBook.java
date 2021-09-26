public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        int totalFlip=n/2;
        int targetFlip=p/2;
        int backFlip=totalFlip-targetFlip;
        return Math.min(targetFlip,backFlip);
    }
}
