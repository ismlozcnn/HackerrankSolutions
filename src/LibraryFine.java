public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here

        if(y2-y1<0){
            return 10000;
        }
        else if(y2-y1>0){
            return 0;
        }
        else{
            if(m2-m1<0){
                return (m1-m2)*500;
            }
            else if(m2-m1>0){
                return 0;
            }
            else{
                if(d1-d2>0){
                    return (d1-d2)*15;
                }else{
                    return 0;
                }

            }
        }

    }
}
