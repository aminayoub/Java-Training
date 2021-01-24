public class ReverseWords {

    public static void main(String[] args){
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }


    public static String reverseWords(final String original)
    {
        String[] words = original.split(" ");
        String reversedString = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String reverseWord = "";
            // - 1 returns the last element in the array
            for(int j = word.length()-1; j >= 0; j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString;
    }

}
