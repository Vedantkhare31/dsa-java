/*  Find Maximum and Minimum
Difficulty: Easy
EsƟmated Time: 15 minutes
Problem Statement
A company stores the daily sales figures of a store in an array.
Find the maximum and minimum sales values without using any built-in sorƟng funcƟon.
Input Format
N
N integers
Output Format
Maximum: <maximum>
Minimum: <minimum>
Constraints
 1 ≤ N ≤ 1000
 -10^9 ≤ A[i] ≤ 10^9
*/
import java.util.Scanner;
class MinMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc . nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the " + size + " elements :" );
        for(int i = 0 ; i<size ; i++){
            nums[i]=sc.nextInt();
        }
        int max = nums[0] ;
        int min = nums[0] ;
         for(int i =0; i<size ; i++){
             if(nums[i]>max){
                 max = nums[i];
             }
         }
         for(int i = 0 ; i<size ; i++){
             if(nums[i]<min){
                 min=nums[i];
             }
         }
         System.out.print("Maximum digit : " + max);
         System.out.println();
         System.out.print("Minimum digit : " + min);

         sc.close();
    }
}