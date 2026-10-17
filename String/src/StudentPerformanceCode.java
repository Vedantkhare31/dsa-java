/* A college assessment plaƞorm generates a numeric summary from the names of students parƟcipaƟng in a
coding compeƟƟon. Each name is transformed into a sequence of values based on the alphabet posiƟons
of its characters.
Pair characters from the beginning and end of each name, moving inward. For every pair, calculate the sum
of their alphabet posiƟons. If the sum exceeds 26, subtract 26 repeatedly unƟl the result falls between 1
and 26. Append the resulƟng value. If the name contains an unpaired middle character, append its alphabet
posiƟon directly. Concatenate the codes for all names without separators.
Input Format
A single line containing one or more names separated by single spaces.
Output Format
Print the resulƟng numeric code as a string.
Constraints
 1 <= |S| <= 100
 Only English leƩers and single spaces are permiƩed.
 All posiƟons are between 1 and 26.
 The wrapping operaƟon must produce a value from 1 to 26.
Example
Input:
ABC
Output:
42
*/

import java.util.Scanner;
class StudentPerformanceCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student names : ");
        String name = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;
        for(int i = 0 ; i<=name.length();i++){
            if(i == name.length() || name.charAt(i) == ' '){

                int left = start;
                int right = i-1;

                while (left < right) {
                     int a = name.charAt(left) - 'A' + 1 ;
                     int b = name.charAt(right) - 'A' + 1;

                     int sum = a+b;

                     if(sum>26){
                         sum = sum - 26;
                     }
                     result = result + sum;
                     left++;
                     right--;
                }
                if(left == right){
                    int mid = name.charAt(left) - 'A' + 1;
                    result = result + mid;
                }
                start = i+1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}