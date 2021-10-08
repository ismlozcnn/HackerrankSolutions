public class ModifiedKaprekarNumbers {
    public static void kaprekarNumbers(int p, int q) {
        // Write your code here

        StringBuilder sb=new StringBuilder();
        boolean flag=true;

        for(int i=p;i<=q;i++){
            double lgt=Integer.toString(i).length();
            double left=Math.pow(i,2)%Math.pow(10,lgt);
            double right=(Math.pow(i,2)-left)/Math.pow(10,lgt);
            if(left+right==i){
                sb.append(i);
                sb.append(" ");
                flag=false;
            }
        }
        if(flag){
            System.out.println("INVALID RANGE");
        }
        else{
            System.out.println(sb);
        }

    }
}
