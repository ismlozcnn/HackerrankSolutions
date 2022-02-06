import java.util.Arrays;
import java.util.List;

public class OrganizingContainersBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here

        int[] sums=new int[container.size()];
        int[] conts=new int[container.size()];

        for(int i=0;i<container.size();i++){
            for(int j=0;j<container.get(i).size();j++){
                sums[j]=sums[j]+container.get(i).get(j);
                conts[i]=conts[i]+container.get(i).get(j);
            }
        }
        //test caselerinde int değer aralığı patlıyor ondan ekledin!
        Arrays.sort(sums);
        Arrays.sort(conts);
        return Arrays.equals(sums,conts)?"Possible":"Impossible";

    }
}
