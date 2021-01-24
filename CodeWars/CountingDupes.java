import java.util.HashMap;
import java.util.Map;

public class CountingDupes {

    public static void main(String[] args){
        System.out.println(duplicateCount("abc"));
    }


    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < text.length(); i++){
            char s = text.charAt(i);
            if(map.containsKey(s)){
                map.get(s);
                map.put(s, ++count);
            } else {
                map.put(s, 1);
            }
        }
        return count;
    }
}
