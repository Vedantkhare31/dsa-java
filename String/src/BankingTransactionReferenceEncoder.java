/* A bank assigns a numeric reference code to each transaction description to help its internal system index
transactions efficiently. The description can contain multiple words, and each word must be converted
independently before the resulƟng codes are combined.
For every word, first calculate the absolute alphabet-position difference between each adjacent pair of
characters, moving from leŌ to right. If a word contains only one character, use that character's alphabet
position. If a word contains multiple characters, append each adjacent difference in sequence. AŌer
processing all words, concatenate their codes in the original order.
For example, the word BANK produces differences 1, 13, and 3, giving 1133. Your task is to generate the
complete transaction reference code.
Input Format
A single line containing the transaction description S.
Output Format
Print the concatenated reference code as a string.
Constraints
 1 <= |S| <= 100
 Only English letters and single spaces are allowed.
 Character positions are case-insensitive.
 Do not calculate differences between characters belonging to different words.
Example
Input:
BANK ATM
Output:
1133197 */

import java.util.Scanner;
class BankingTransactionReferenceEncoder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the transaction description : ");
        String sentence = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;
        for(int i = 0 ; i<=sentence.length() ; i++){
            if(i==sentence.length() || sentence.charAt(i) == ' '){
                int left = start;
                int right = start+1;

                while(right<i){
                    int a = sentence.charAt(left);
                    int b = sentence.charAt(right);

                    a = a - 'A' + 1;
                    b = b - 'A' + 1;

                    int diff= a-b;
                    if(diff<0){
                        diff = -diff;
                    }
                    result=result+diff;
                    left++;
                    right++;
                }
                if (left == start) {
                    int position = sentence.charAt(start) - 'A' + 1;
                    result = result + position;
                }
                start = i+1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}