import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //YES, TEST CASE PASSED WITHOUT BIGINTEGERS!!!!!!
        int numTestCase, num, result, temp;
        boolean isPrime;

        Scanner in = new Scanner(System.in);
        numTestCase = in.nextInt();

        for(int i = 0; i < numTestCase; ++i){

            num = in.nextInt();
            result = 1;

            if(num > 1){
                temp = 2;
                while(temp*2 <= num){
                    temp*=2;
                }
                result *= temp;
            }

            for(int j = 3; j <= num; j+=2){

                isPrime = true;

                for(int k = 2; k < j; ++k){
                    if(j % k == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    temp = j;
                    while(temp*temp <= num){
                        temp*=temp;
                    }
                    result *= temp;
                }
            }
           System.out.println(result);
        }
    }
}
