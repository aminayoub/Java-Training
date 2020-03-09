import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingInts {
    public static int sortDesc(final int num){
        List<String> numList = new ArrayList<>();
        for(int i = 0; i < String.valueOf(num).length(); i++) {
            numList.add(i, String.valueOf(num).substring(i, i + 1));
        }
        Collections.sort(numList, Collections.reverseOrder());
        String numString = "";
        for(String value : numList) {
            numString = numString.concat(value);
        }
        return Integer.parseInt(numString);
    }
}
