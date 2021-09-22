public class SherlockAndTheBeast {

    public static void decentNumber(int n) {
        // Write your code here
        int fives=0;
        int threes=0;

        while(n>0){
            if(n%3==0){
                n-=3;
                fives++;

            }
            else if(n%5==0){
                n-=5;
                threes++;
            }
            else{
                n-=3;
                fives++;
            }
            if(n<0){
                System.out.print(-1);
                fives=0;
                threes=0;
            }
        }
        StringBuilder ss=new StringBuilder();
        for(int j=0;j<fives;j++){
            ss.append(555);
        }
        for(int i=0;i<threes;i++){
            ss.append(33333);
        }

        System.out.println(ss);

    }
}
