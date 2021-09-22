public class UtopianTree {

    public static int utopianTree(int n) {
        int height=1;
        if(n==0){
            return height;
        }
        if(n==1){
            return 2*height;
        }
        for (int j=1;j<=n;j++){
            if(j%2==0){
                height+=1;
            }else{
                height*=2;
            }

        }
        return height;
    }

}

