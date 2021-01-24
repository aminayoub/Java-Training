import java.util.Arrays;

public class SumOfPositive {

    public static void main(String[] args){
        System.out.println(sum(new int[]{1,2,3,4,5}));
    }

    public static int sum(int[] arr){

        int res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) {
                res = res + arr[i];
            }
        }
        return res;
    }
}


/*
Alternative ways

import java.util.Arrays;
public class Positive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}


 */
