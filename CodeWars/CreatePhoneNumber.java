import java.util.Arrays;

public class CreatePhoneNumber {

    public static void main(String[] args){
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers){
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0)
                res += '(';
            else if (i == 3)
                res += ") ";
            else if (i == 6)
                res += '-';

            res += numbers[i];
        }
        return res;
    }
}
