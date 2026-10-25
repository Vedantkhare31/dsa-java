/* A research repository stores thousands of paper titles and requires a compact numeric representation for
indexing and duplicate-title analysis. The repository uses a deterministic transformation based on each
word's character positions and the number of distinct characters. Because titles can contain repeated
letters, the transformation must account for repetition without treating uppercase and lowercase letters as
different symbols.
For each word, calculate the sum of the alphabet positions of its characters. Count the number of distinct
characters in the word, and calculate the absolute difference between the sum and the square of the
distinct-character count. If the result is zero, use the sum of the character positions instead. Append the
resulƟng integer as the code for that word. Concatenate all word codes in the original order.
Input Format
A single line containing the research paper title S.
Output Format
Print the encoded title as a string.
Constraints
 1 <= |S| <= 200
 Only English letters and single spaces are allowed.
 Alphabet positions are case-insensitive.
 Each word is processed independently.
 The result is never negative.
Example
Input:
ABA
Output:
4
*/


import java.util.Scanner;

class ResearchPaperMetadataEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter research paper title: ");
        String title = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;

        for (int i = 0; i <= title.length(); i++) {
            if (i == title.length() || title.charAt(i) == ' ') {

                int end = i - 1;
                int count = 0;
                int sum = 0;

                boolean[] Visited = new boolean[26];

                for (int j = start; j <= end; j++) {
                    int a = title.charAt(j) - 'A' + 1;
                    sum = sum + a;

                    int index = title.charAt(j) - 'A';

                    if (!Visited[index]) {
                        count++;
                        Visited[index] = true;
                    }
                }

                int square = count * count;
                int diff = sum - square;

                if (diff < 0) {
                    diff = -diff;
                }

                if (diff == 0) {
                    result = result + sum;
                } else {
                    result = result + diff;
                }

                start = i + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
