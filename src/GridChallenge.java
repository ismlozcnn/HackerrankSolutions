import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        for(int i=0;i<grid.size();i++){
            char[] gridElements=grid.get(i).toCharArray();
            Arrays.sort(gridElements);
            grid.set(i,new String(gridElements));
        }
        List<String> columnGrid=new ArrayList<>();
        for(int i=0;i<grid.get(0).length();i++){
            char[] columGridElements=new char[grid.size()];
            for(int j=0;j<grid.size();j++){
                columGridElements[j]=grid.get(j).charAt(i);
            }
            columnGrid.add(new String(columGridElements));
        }
        List<String> sortedColumGrid=new ArrayList<>();
        for(int i=0;i< columnGrid.size();i++){
            char[] gridElements=columnGrid.get(i).toCharArray();
            Arrays.sort(gridElements);
            sortedColumGrid.add(new String(gridElements));
        }
        boolean flag=false;
        for(int i=0;i<sortedColumGrid.size();i++){
            if(!columnGrid.get(i).equals(sortedColumGrid.get(i))){
                flag=true;
                break;
            }

        }
        if(flag){
            return "NO";
        }
        else{
            return "YES";
        }

    }
}
