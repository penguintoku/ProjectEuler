import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        //BIGINTEGERS ARE EVIL!!!!

        BigInteger num, result, inc, b2, b3;
        b2 = new BigInteger("2");
        b3 = new BigInteger("3");

        int numTestCase;

        Scanner in = new Scanner(System.in);
        numTestCase = in.nextInt();

        for(int i = 0; i < numTestCase; ++i){

            num = in.nextBigInteger();

            result = BigInteger.ZERO;
            inc = b3;

            //continue to divide by 2 if num is even
            while(num.compareTo(BigInteger.ONE) > 0){
                //if power of 2, then prime is 2
                if(num.equals(b2)){
                    result = b2;
                    break;
                }
                //continue divide until odd
                if(num.mod(b2).equals(BigInteger.ZERO)){
                    num = num.divide(b2);
                }
                //when odd break out
                else{
                    break;
                }
            }

            /**
             * Since Java doesn't have sqrt for BigIntegers... This kind soul has.
             * http://faruk.akgul.org/blog/javas-missing-algorithm-biginteger-sqrt/
             */
            BigInteger s;
            BigInteger a = BigInteger.ONE;
            BigInteger b = new BigInteger(num.shiftRight(5).add(new BigInteger("8")).toString());
            while(b.compareTo(a) >= 0) {
                BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
                if(mid.multiply(mid).compareTo(num) > 0){
                    b = mid.subtract(BigInteger.ONE);
                }
                else{
                    a = mid.add(BigInteger.ONE);
                }
            }
            s = a.add(BigInteger.ONE);

            while(inc.compareTo(s) < 0){
                //if = 1, then the number is in lowest prime
                if(num.divide(inc).equals(BigInteger.ONE)){
                    result = num;
                    break;
                }
                //continue dividing the odd
                else if(num.mod(inc).equals(BigInteger.ZERO)){
                    num = num.divide(inc);
                    result = num;
                    inc = b3;
                }
                else{
                    result = num;
                    inc = inc.add(b2);
                }
            }
            System.out.println(result);
        }
    }
}
