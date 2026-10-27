/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */

import java.util.*;
public class ReverseTrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i = rows ; i >= 0 ; i--){
            for(int j = 0 ; j <= i-1 ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
