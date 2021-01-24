import java.util.*;

public class FindOdd {

    public static void main(String[] args){
        System.out.println(findIt(new int[]{1,2,3,4,5,6,7,8}));

    }


    public static int findIt(int[] a) {
        int odd = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0){
                odd++;
            }
        }

        return odd;

    }

}
