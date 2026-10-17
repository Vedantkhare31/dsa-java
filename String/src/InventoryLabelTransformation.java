/* A warehouse uses compact numeric labels to identify products in its inventory. Every product name is
processed independently by pairing characters from opposite ends. Calculate the absolute difference
between the alphabet positions of each pair. If the difference is odd, append twice that difference; if it is
even, append half that difference using integer division. If the word has a middle character, append its
alphabet position unchanged aŌer all pairs have been processed.
Concatenate the generated values for each word, and then concatenate the codes for all product names in
the original order. This transformation must be applied consistently regardless of whether the word length
is even or odd.
Input Format
A single line containing one or more product names separated by spaces.
Output Format
Print the final numeric code as a string.
Constraints
 1 <= |S| <= 100
 Each word contains English letters only.
 All alphabet positions are case-insensitive.
 Integer division is used for even differences.
Example
Input:
ABC
Output:
12 */
import java.util.Scanner;
class InventoryLabelTransformation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter products names : ");
        String name = sc.nextLine().toUpperCase();
        String result = "";

        int start = 0;
        for(int i = 0 ; i<=name.length() ; i++){
            if(i == name.length() || name.charAt(i) == ' '){
                int left = start ;
                int right = i-1;

                while(left<right){
                    int a = name.charAt(left) - 'A' + 1;
                    int b = name.charAt(right) - 'A' + 1;

                    int diff = a-b;
                    if(diff<0){
                        diff = -diff;
                    }
                    if(diff%2==0){
                        diff = diff / 2;
                    }
                    else{
                        diff = diff * 2;
                    }
                    result = result + diff;
                    left++;
                    right--;
                }
                if(left==right){
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