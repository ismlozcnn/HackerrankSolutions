public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int i=0;
        int energy=100;

        while(energy!=0){
            i=(i+k)%c.length;
            if(c[i]==1){
                energy=energy-3;
            }else{
                energy--;
            }
            if(i==0){
                break;
            }

        }

        return energy;
    }
}
