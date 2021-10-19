import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatlandSpace {

    static int flatlandSpaceStations(int n, int[] c) {

        List<Integer> indexs= new ArrayList<>();
        List<Integer> liste= Arrays.stream(c).boxed().sorted().collect(Collectors.toList());
        int a=liste.get(0);
        int b=n-1-liste.get(liste.size()-1);
        int count=0;
        for(int i=0;i<liste.size()-1;i++){
            indexs.add(liste.get(i+1)-liste.get(i));

        }
        if(indexs.size()!=0){
            count=Collections.max(indexs)/2;
        }

        int total=Math.max(a,b);
        int kk= Math.max(count,total);

        return kk;
    }
}
