import java.util.List;

public class InsertionSort {

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int temp=arr.get(arr.size()-1);

        for(int i=arr.size()-1;i>=0;i--){
            if(i==0){
                if(arr.get(i)>temp){
                    arr.set(i,temp);
                    print(arr);
                    break;
                }
            }
            if(arr.get(i-1)>temp){
                arr.set(i,arr.get(i-1));
            }
            else{
                arr.set(i,temp);
                print(arr);
                break;
            }
            print(arr);

        }

    }

    private static void print(List<Integer> arr){
        for (int i=0; i < arr.size(); i++) {
            System.out.print(arr.get(i) +" ");
        }
        System.out.println();
    }
}
