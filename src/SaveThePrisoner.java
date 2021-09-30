public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int index=(s+m-1)%n;
        if(index==0){
            return n;
        }else{
            return index;
        }
    }
}
