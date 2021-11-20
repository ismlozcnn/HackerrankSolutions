import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        String s;
        if(grid.size()<3){
            return grid;
        }

        for (int i=1; i < grid.size()-1; i++) {
            for (int j=i; j < grid.size()-1; j++) {
                if (    grid.get(i).charAt(j) > grid.get(i - 1).charAt(j) &&
                        grid.get(i).charAt(j) > grid.get(i).charAt(j - 1) &&
                        grid.get(i).charAt(j) > grid.get(i + 1).charAt(j) &&
                        grid.get(i).charAt(j) > grid.get(i).charAt(j + 1)   ) {
                    s=grid.get(i).substring(0,j)+ "X"+grid.get(i).substring(j+1, grid.size());
                    grid.set(i,s);
                }

            }
        }


        return grid;
    }
}
