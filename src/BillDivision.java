import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum=0;
        for(int i=0;i<bill.size();i++){
            if(i==k){
                continue;
            }
            sum+=bill.get(i);
        }
        sum=sum/2;
        if(sum==b){
            System.out.println("Bon Appetit");
        }else{
            sum=b-sum;
            System.out.println(sum);
        }

    }
}
