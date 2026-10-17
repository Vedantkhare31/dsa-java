/* A document management system generates a compact numeric code for every document tle.
The system divides the tle into words and processes each word independently. For a word containing an even
number of characters, pair the first character with the last, the second with the second-last, and so on.
For a word containing an odd number of characters, process the outer pairs in the same manner and include the
middle character's alphabet posi on as the final group. For every pair, calculate the absolute difference between
the alphabet posi ons of the two characters. Append the alphabet posi on of the middle character when a word has
odd length. Concatenate all group values, then concatenate the codes of all words in their original order to produce
the final numeric code. Input Format A single line containing a string S consis ng of English words separated by single
spaces. Output Format Print the final numeric code as a string. Constraints  1 <= |S| <= 100  Each word contains only
 English le ers.  Words are separated by exactly one space.
   The order of words must not change
   Example Input: CAT DOG
   Output: 171315 */

import java.util.Scanner;
class SmartTextCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence : ");
        String sentence = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;

        for(int i = 0 ; i <= sentence.length() ; i++){
            if(i==sentence.length() || sentence.charAt(i) == ' '){

                int left = start ;
                int right = i-1;

                while(left<right){
                    int a = sentence.charAt(left);
                    int b = sentence.charAt(right);

                    a = a - 'A' + 1;
                    b = b - 'A' + 1;

                    int difference = a-b;
                    if(difference<0){
                        difference=-difference;
                    }
                    result = result + difference;
                    left++;
                    right--;
                }
                if(left == right){
                    int mid = sentence.charAt(left);

                    mid = mid - 'A' +1 ;
                    result = result + mid ;
                }
                start = i+1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
