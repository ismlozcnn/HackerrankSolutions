public class DayOfProgrammer {

    public static String dayOfProgrammer(int year) {
        // Write your code here
        StringBuilder sb=new StringBuilder();

        if(year<=1917){
            if(year%4==0){
                sb.append("12.09.");
                sb.append(year);
                return sb.toString();
            }
            else{
                sb.append("13.09.");
                sb.append(year);
                return sb.toString();

            }

        }else{
            if(year==1918){
                sb.append("26.09.");
                sb.append(year);
                return sb.toString();
            }
            if(year%400==0 ||(year%4==0 && year%100!=0)){
                sb.append("12.09.");
                sb.append(year);
                return sb.toString();
            }
            else{
                sb.append("13.09.");
                sb.append(year);
                return sb.toString();
            }


        }


    }
}
