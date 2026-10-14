/* Count Even and Odd Elements

Difficulty: Easy
EsƟmated Time: 15 minutes
Problem Statement
A programmer is analyzing a list of integers and wants to determine how many numbers are even and how
many are odd.
Given an array, count the number of even and odd elements.
Input Format
N
N integers

Output Format
Even: <count>
Odd: <count>

Constraints
 1 ≤ N ≤ 1000
 -10^6 ≤ A[i] ≤ 10^6*/
import java.util.Scanner;
class EvenOdd {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the elements : ");
         int size = sc.nextInt();
         int[] num = new int[size];

         System.out.println("Enter the " + size + "elements :");
         for(int i = 0; i<size ; i++){
             num[i] = sc.nextInt();
         }
         int countEven = 0;
         int countOdd = 0;
         for(int i = 0; i<size ; i++){
             if(num[i] % 2 == 0){
                 countEven++;
             }
             else{
                 countOdd++;
             }
         }
         System.out.println("Number of Evens : " + countEven );
         System.out.println("Number of odds : " + countOdd);

         sc.close();
     }
}
