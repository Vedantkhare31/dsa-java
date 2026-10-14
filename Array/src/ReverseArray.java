/* Reverse an Array
Difficulty: Easy
EsƟmated Time: 15 minutes
Problem Statement
A data-processing applicaƟon needs to display a list of numbers in reverse order.
Given an array, reverse the array without using another array.
Input Format
N
N integers
Output Format
Print the reversed array separated by spaces.
Constraints
 1 ≤ N ≤ 1000
*/
import java.util.Scanner;
class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the " + size + " elements :");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int start = 0 ;
        int end = nums.length-1;

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}