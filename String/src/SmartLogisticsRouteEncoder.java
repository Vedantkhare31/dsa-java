/* A logisƟcs company uses route names to create compact numeric idenƟfiers for its delivery network. Each
route name must be converted into a sequence of numbers that reflects the relaƟve posiƟons of characters
while accounƟng for the length of the route name. The same route name must always generate the same
idenƟfier.
For each word, pair characters from the beginning and end, moving inward. Calculate the absolute
difference between the alphabet posiƟons of each pair. MulƟply that difference by the length of the word.
If the resulƟng value is greater than 99, replace it with the sum of its decimal digits repeatedly unƟl the
value is at most 99. If the word has a middle character, mulƟply its alphabet posiƟon by the word length
and apply the same reducƟon rule. Append each resulƟng value in order, then concatenate the codes for all
words.
Input Format
A single line containing one or more route names separated by spaces.
Output Format
Print the final route idenƟfier as a string.
Constraints
 1 <= |S| <= 200
 Each word contains only English leƩers.
 Word length is at most 50.
 Apply digit-sum reducƟon repeatedly only when a value exceeds 99.
 Preserve the original order of all groups and words.
Example
Input:
ABC
Output:
66
*/


import java.util.Scanner;
class SmartLogisticsRouteEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter route names: ");
        String name = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;

        for (int i = 0; i <= name.length(); i++) {

            if (i == name.length() || name.charAt(i) == ' ') {

                int left = start;
                int right = i - 1;
                int length = i - start;

                while (left < right) {
                    int a = name.charAt(left) - 'A' + 1;
                    int b = name.charAt(right) - 'A' + 1;

                    int diff = a - b;

                    if (diff < 0) {
                        diff = -diff;
                    }

                    int multiply = diff * length;

                    while (multiply > 99) {
                        int digitSum = 0;

                        while (multiply > 0) {
                            digitSum = digitSum + multiply % 10;
                            multiply = multiply / 10;
                        }

                        multiply = digitSum;
                    }

                    result = result + multiply;

                    left++;
                    right--;
                }

                if (left == right) {
                    int mid = name.charAt(left) - 'A' + 1;
                    int multiply = mid * length;

                    while (multiply > 99) {
                        int digitSum = 0;

                        while (multiply > 0) {
                            digitSum = digitSum + multiply % 10;
                            multiply = multiply / 10;
                        }

                        multiply = digitSum;
                    }

                    result = result + multiply;
                }

                start = i + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
