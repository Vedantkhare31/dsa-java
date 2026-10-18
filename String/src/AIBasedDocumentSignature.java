/* An AI-powered document management plaƞorm generates a numeric signature for every document
heading. The signature must depend on both the alphabet posiƟons and the frequencies of the characters.
This helps the system create a consistent representaƟon of a heading without retaining the original text in
its compact index.
For each word, calculate the sum of the alphabet posiƟons of all its characters. Next, count the number of
disƟnct characters in that word. MulƟply the sum by the number of disƟnct characters, and append the
resulƟng integer as the word's code. Character comparisons are case-insensiƟve, so A and a represent the
same character. Finally, concatenate all word codes in their original order.
Input Format
A single line containing the document heading S.
Output Format
Print the numeric signature as a string.
Constraints
 1 <= |S| <= 200
 Only English leƩers and single spaces are allowed.
 Character frequency is calculated independently for each word.
 Repeated leƩers count only once when calculaƟng disƟnct characters.
Example
Input:
ABA CAT
Output:
872
*/

import java.util.Scanner ;
class AIBasedDocumentSignature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the document heading : ");
        String heading = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;
        for(int i = 0 ; i <= heading.length() ; i++){
           if(i == heading.length() || heading.charAt(i) == ' '){

               int end = i-1;
               int sum = 0 ;
               int count = 0;

               boolean[] visited = new boolean[26];

               for(int j = start ; j<=end ; j++){
                   int a = heading.charAt(j) - 'A' + 1 ;

                   sum = sum + a ;

                   int index = heading.charAt(j) - 'A' ;
                   if(!visited[index]){
                       count++ ;
                       visited[index] = true;
                   }
               }
               int code = sum * count ;
               result = result + code;

               start = i + 1;
           }
        }
        System.out.println(result);
        sc.close();
    }
}