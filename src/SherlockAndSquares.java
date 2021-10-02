public class SherlockAndSquares {

    public static int squares(int a, int b) {
        // Write your code here
        int count=0;
        int kok=(int) Math.sqrt(a);
        if(kok*kok<a){
            kok++;
        }
        while(kok*kok<=b){
            kok++;
            count++;
        }
        return count;
    }
}
