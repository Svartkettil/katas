package kataSquareSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main{
    static int[] numberArray = {1,2,3};

    public static void main(String[] args) {
        System.out.println(squareSum(numberArray));
    }

    public static int squareSum(int[] n){
        int sum = 0;
        for (double banan:n) {
            banan = Math.pow(banan, 2);
            sum += banan;
        }
        return sum;
    }

}
