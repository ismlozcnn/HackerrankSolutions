import java.util.List;

public class LisaWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int page=1;
        int count=0;
        for(int i=0;i< arr.size();i++){
            for(int j=1;j<=arr.get(i);j++){
                if(page==j){
                    count++;
                }
                if(j%k==0 || j==arr.get(i)){
                    page++;
                }

            }
        }
        return count;
    }
}
