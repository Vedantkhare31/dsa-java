/* Count PosiƟve, NegaƟve and Zero
Difficulty: Easy
EsƟmated Time: 15 minutes
Problem Statement
A financial applicaƟon receives a list of changes in account balances. PosiƟve values represent credits,
negaƟve values represent debits, and zero represents no change.
Given an array, count the number of posiƟve, negaƟve, and zero elements.
Input Format
N
N integers
Output Format
PosiƟve: <count>
NegaƟve: <count>
Zero: <count>
Constraints
 1 ≤ N ≤ 1000
 -10^6 ≤ A[i] ≤ 10^6 */

import java.util.Scanner;
class CountElementsSign{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter the " + size +  " elements : ");
        for(int i = 0 ; i<size ; i++){
            nums[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0 ;

        for (int i = 0 ; i<size ; i++){
            if(nums[i]<0){
                negativeCount++;
            }
            else if(nums[i]>0){
                positiveCount++;
            }
            else{
                zerosCount++;
            }
        }
        System.out.println("Total positive values : " + positiveCount);
        System.out.println("Total negative values : " + negativeCount);
        System.out.println("Total zero values : " + zerosCount);

        sc.close();
    }
}