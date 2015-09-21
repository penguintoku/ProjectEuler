import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numTestCase = in.nextInt();

        /**
         *  BIGINTEGER ARE EVIL!!!!!!!
         * Needed to do in BigInteger since the test case on the site was large.
         */

        //Initialize
        BigInteger num, sum, sub1, num3, num5, num15, t3, t5, t15;

        BigInteger b2 = new BigInteger("2");
        BigInteger b3 = new BigInteger("3");
        BigInteger b5 = new BigInteger("5");
        BigInteger b15 = new BigInteger("15");

        for(int i = 0; i < numTestCase; ++i){

            num = in.nextBigInteger();

            //subtract one
            sub1 = num.subtract(BigInteger.ONE);

            //divide for 3, 5, and 15
            num3 = sub1.divide(b3);
            num5 = sub1.divide(b5);
            num15 = sub1.divide(b15);

            //using AP Formula
            t3 = (b3.multiply(num3).multiply(num3.add(BigInteger.ONE))).divide(b2);
            t5 = (b5.multiply(num5).multiply(num5.add(BigInteger.ONE))).divide(b2);
            t15 = (b15.multiply(num15).multiply(num15.add(BigInteger.ONE))).divide(b2);

            //sum is the difference
            sum = t3.add(t5).subtract(t15);

            //print the solution
            System.out.println(sum);
        }

        /**
        int num, sum;

        for(int i = 0; i < numTestCase; ++i){

            num = in.nextInt();

            int num3 = (num-1) / 3;
            int num5 = (num-1) / 5;
            int num15 = (num-1) / 15;

            sum = (((3*num3*(num3+1))/2) + ((5*num5*(num5+1))/2) - ((15*num15*(num15+1))/2));

            System.out.println(sum);
        }
        */
    }
}
