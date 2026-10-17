/* A soŌware company generates temporary access tokens from user-defined phrases. Each word is processed
from its outermost characters toward the center. For every pair, subtract the smaller alphabet posiƟon from
the larger one. If the difference is zero, replace it with the sum of the two alphabet posiƟons. If the word
has an unpaired middle character, append its alphabet posiƟon mulƟplied by the number of characters in
that word.
AŌer processing each word, concatenate its generated values. Concatenate all word codes to form the
access token. The generated token must be printed as a string so that long codes and leading zeros, if any,
are preserved.
Input Format
A single line containing a phrase S.
Output Format
Print the generated access token as a string.
Constraints
 1 <= |S| <= 100
 Only English leƩers and single spaces are allowed.
 Alphabet posiƟons are case-insensiƟve.
 Use the specified rule for equal-character pairs.
Example
Input:
ABA
Output:
26
*/
import java.util.Scanner;
class SecureAccessTokenGenerator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence : ");
        String sentence = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;

        for(int i = 0 ; i<=sentence.length() ; i++ ){
            if(i==sentence.length() || sentence.charAt(i) == ' '){
                int left = start ;
                int right = i-1;

                while(left<right){
                    int a = sentence.charAt(left);
                    int b = sentence.charAt(right);

                    a = a - 'A' + 1;
                    b = b - 'A' + 1;

                    int diff = a-b;
                    int sum = a+b;

                    if(diff<0){
                        diff = -diff;
                        result = result + diff;
                    }
                    else if(diff==0){
                        result = result + sum;
                    }
                    else{
                        result = result + diff;
                    }
                    left++;
                    right--;
                }
                if(left==right){
                    int mid = sentence.charAt(left);
                    mid = mid - 'A' + 1;
                    mid = mid*sentence.length();

                    result= result + mid;
                }
                start = i+1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}