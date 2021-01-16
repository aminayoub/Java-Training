import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static boolean isIsogram(String str){

        String[] arr = str.split("");
        Set<String> mySet = new HashSet<String>(Arrays.asList(arr));

        if(str.length() == mySet.size()){
            return true;
        } else {
            return false;
        }

    }
}
