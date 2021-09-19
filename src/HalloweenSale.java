public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int sum=0;
        int count=0;

        while(s>=p){
            s=s-p;
            if((p-d)>m){
                p=p-d;
            }else{
                p=m;
            }
            count++;
            if((s-p)<0){
                break;
            }

        }
        return count;

    }
}
