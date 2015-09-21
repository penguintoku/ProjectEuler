import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //BIGINTEGER ARE EVIL!!!!

        Scanner in = new Scanner(System.in);

        int numTestCase = in.nextInt();

        BigInteger sum, num, prev, prev_prev, current;

        BigInteger b2 = new BigInteger("2");

        for(int i = 0; i < numTestCase; ++i){

            num = in.nextBigInteger();

            //initialize
            sum = BigInteger.ZERO;
            prev = BigInteger.ONE;
            prev_prev = BigInteger.ZERO;
            current = BigInteger.ZERO;

            //compute from bottom up
            while(num.compareTo(current) > 0){
                current = prev.add(prev_prev);
                prev_prev = prev;
                prev = current;
                //if even 
                if(current.mod(b2).equals(BigInteger.ZERO)){
                    if(num.compareTo(current) > 0){
                        sum = sum.add(current);
                    }
                }
            }
            System.out.println(sum);
        }

        /*
        Scanner in = new Scanner(System.in);

        int numTestCase = in.nextInt();

        long sum, num;

        int prev, prev_prev, current;


        for(int i = 0; i < numTestCase; ++i){

            num = in.nextLong();
            sum = 0;
            prev = 1;
            prev_prev = 0;
            current = 0;

            while(num > current){

                current = prev + prev_prev;
                prev_prev = prev;
                prev = current;
                if((current % 2 == 0) && (num > current)){
                    sum += current;
                }
            }

            System.out.println(sum);

        }
        */
    }
}
