import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiagonal=0;
        int leftDiagonal=0;
        for(int i=0;i<arr.size();i++){
            rightDiagonal=rightDiagonal+arr.get(i).get(i);

        }
        int k=0;
        for (int j=arr.size()-1;j>=0;j--){
            leftDiagonal=leftDiagonal+arr.get(j).get(k);
            k++;
        }

        return Math.abs(rightDiagonal-leftDiagonal);
    }
}
