public class DuplicateCount {
//    Write a function that will return the count of distinct case-insensitive
//    alphabetic characters and numeric digits that occur more than once in the input string.
//    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    public static int duplicateCount(String text) {
        // Write your code here
        String lowerText = text.toLowerCase();
        char[] charArray = lowerText.toCharArray();
        //keeping track of unique characters
        String uniqueRepeats = "";
        int count = 0;
        for(int i = 0; i < charArray.length - 1; i ++) {
            String strng = lowerText.substring(i + 1);
            String character = Character.toString(charArray[i]);

            //checks characters that are duplicates
            if(!uniqueRepeats.contains(character)) {
                if(strng.indexOf(character) != -1) {
                    count++;
                    uniqueRepeats += character;
                }
            }
        }
        return count;
    }
}
