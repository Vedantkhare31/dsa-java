/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.*;
public class FloydsTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int count = 1;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}