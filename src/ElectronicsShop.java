public class ElectronicsShop {

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int sum=0;
        int temp=0;
        for(int i=0;i<keyboards.length;i++){
            for(int j=0;j<drives.length;j++){
                int tmp2=0;
                if(keyboards[i]+drives[j]<=b){
                    tmp2=keyboards[i]+drives[j];
                }
                if(temp<tmp2){
                    temp=tmp2;
                }
            }
            if(sum<temp){
                sum=temp;
            }
        }
        if(sum==0){
            sum=-1;
        }


        return sum;



    }

}
