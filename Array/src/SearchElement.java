/* Search an Element
Difficulty: Easy
EsƟmated Time: 15 minutes
Problem Statement
A college maintains student enrollment numbers in an array.
Given an enrollment number, determine whether it exists in the array. If it exists, print its first index.
Otherwise, print -1.
Use linear search.
Input Format
N
N integers Target

Output Format
Index: <index>
Constraints
 1 ≤ N ≤ 1000 */

import java.util.Scanner;
class SearchElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to find : ");
        int k = sc.nextInt();

        boolean elementFound = false ;
        for (int i = 0; i < size; i++) {
            if (nums[i] == k) {
                System.out.println("Element found at index : " + i);
                elementFound = true ;
            }
        }
        if(!elementFound){
            System.out.println("Element not found : -1 ");
        }
        sc.close();
    }
}
