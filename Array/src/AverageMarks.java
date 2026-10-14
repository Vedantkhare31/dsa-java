/*  Array Sum and Average
Difficulty: Easy
EsƟmated Time: 15 minutes

Problem Statement:-
A teacher wants to analyze the marks obtained by students in a programming test. The marks of all
students are stored in a one-dimensional array.
Given the marks of N students, calculate the total marks and average marks.
Input Format
 First line contains an integer N.
 Second line contains N integers represenƟng the marks.
Output Format
Print:
Total: <total>
Average: <average>
Print the average up to 2 decimal places.
Constraints
 1 ≤ N ≤ 1000
 0 ≤ marks ≤ 100
Example
Input
5
70 80 65 90 75
Output
Total: 380
Average: 76.00
*/
import java.util.Scanner;
class AverageMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of elements inside the array : ");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                num[i] = sc.nextInt();
            }
        int sum = 0;
        int i= 0;
        while(i<size){
            sum=sum+num[i];
            i++;
        }
        double average = (double) sum / size;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
        }
    }
