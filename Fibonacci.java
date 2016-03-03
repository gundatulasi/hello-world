/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import java.util.Scanner;

/**
 *
 * @author S521650
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=1,c=0;
        int temp;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want.");
        c = sc.nextInt();
        for(int i=1;i<=c;i++){
            System.out.print(a);
            temp = a+b;
            a=b;
            b=temp;
            
            
            
            
            
            
            
        }
        
       
        
    }
    
}
