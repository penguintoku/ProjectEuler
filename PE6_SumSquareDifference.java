import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        int numTestCase;
        BigInteger num, sumSq, sqSum, j, b2 = new BigInteger("2"), b6 = new BigInteger("6");

        Scanner in = new Scanner(System.in);

        numTestCase = in.nextInt();

        //THE RETURN OF BIGINTEGERS

        for(int i = 0; i < numTestCase; ++i){

            sumSq = BigInteger.ZERO;
            sqSum = BigInteger.ZERO;
            num = in.nextBigInteger();

           // n * (n+1) * (2n + 1) / 6
            sumSq = (((num.add(BigInteger.ONE)).multiply(num)).multiply((num.multiply(b2)).add(BigInteger.ONE))).divide(b6);

            //(n+1) * n / 2
            sqSum = ((num.add(BigInteger.ONE)).multiply(num)).divide(b2);

            sqSum = sqSum.multiply(sqSum);
            System.out.println(sqSum.subtract(sumSq));
        }
        /*
        for(int i = 0; i < numTestCase; ++i){
            sumSq = 0;
            sqSum = 0;
            num = in.nextInt();

            for(int j = 1; j <= num; ++j){
                sumSq += (j * j);
                sqSum += j;
            }
            sqSum = (sqSum * sqSum);
            System.out.println(sqSum - sumSq);
        }
        */
    }
}
