public class StringExclamationMark {

    public static String replace(final String s) {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                s.replace(s,"!" );

            }
        }

        return s; //coding and coding....
    }
}
