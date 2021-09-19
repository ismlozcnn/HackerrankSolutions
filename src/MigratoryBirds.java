import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int[] counts=new int[6];
        for(int i=0;i<arr.size();i++){
            counts[arr.get(i)]++;
        }

        /*for(int i=1;i<counts.length;i++){
            counts[i] = Collections.frequency(arr, i);
        }*/
        int max=counts[1];
        int hh=0;
        for(int i=2;i<counts.length;i++){
            if(max<counts[i]){
                max=counts[i];
                hh=i;
            }
        }
        return hh;

    }
}
