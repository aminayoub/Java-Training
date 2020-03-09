public class VowelCount {
    public static int getCount(String str){
        int vowelsCount = 0;
        String lowerStr = str.toLowerCase();
        for(int i = 0; i < lowerStr.length(); i++){
            if(lowerStr.charAt(i) == 'a' || lowerStr.charAt(i) == 'e'  || lowerStr.charAt(i) == 'i' || lowerStr.charAt(i) == 'o' || lowerStr.charAt(i) == 'u' ){
                vowelsCount ++;
            }
        }

        return vowelsCount;
    }
}
