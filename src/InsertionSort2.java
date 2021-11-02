import java.util.List;

public class InsertionSort2 {

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here

        for(int i=1;i<arr.size();i++){
            int current=arr.get(i);
            int j=i-1;
            while(j>=0 && current<arr.get(j)){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,current);
            print(arr);
        }
    }

    static void print(List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

    }
}
