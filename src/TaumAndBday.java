public class TaumAndBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here

        long b1=b,w1=w,bc1=bc,wc1=wc,z1=z;
        return b1*Math.min(bc1, wc1+z1) + w1*Math.min(wc1,bc1+z1);


    }
}
