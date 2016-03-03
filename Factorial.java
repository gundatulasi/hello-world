/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.util.Scanner;

/**
 *
 * @author S521650
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial");
        c = sc.nextInt();
        int fact;
        //This is recursive method
        int result = fact(c);
        System.out.println(result);
        
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
        int result = fact(n-1) * n;
        return result;

        }   
}
}
