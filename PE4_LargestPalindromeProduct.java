import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //YEAY NO BIGINTEGERS!!!!

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numTestCase, num, rem, temp, sum, rev, result;

        numTestCase = in.nextInt();

        for(int i = 0; i < numTestCase; ++i){

            num = in.nextInt();
            result = 0;

            for(int j = 999; j >= 100; --j){
                for(int k = 100; k <= 999; ++k){

                    sum = j * k;

                    /**
                     *  Was to tired to figure out an algorithm if the number was palindrome since
                     *  I started late in the morning.
                     *  Used this to determine if it is palindrome.
                     *  http://www.programiz.com/c-programming/examples/palindrome-number
                     */
                    temp = sum;
                    rev = 0;

                    while(temp != 0 && rev < 999999){
                        rem=temp % 10;
                        rev=rev * 10 + rem;
                        temp/=10;
                    }

                    //if it is 6 digits and palindrome
                    if((sum > 100000) && (rev == sum)){
                        if(result < sum && sum < num ){
                            result = sum;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
