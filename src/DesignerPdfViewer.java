import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesignerPdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int maxHeight;
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<word.length();i++){
            int k=word.charAt(i)-97;
            l.add(h.get(k));
        }
        maxHeight= Collections.max(l);
        int lngth=word.length();
        return lngth*maxHeight;
    }
}
