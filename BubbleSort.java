/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Sampath Alampalli
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to sort");
        k = sc.nextInt();
        int arr[] = new int[k];
        System.out.println("Enter "+k+" number of elements");
        for(int i=0;i<k;i++){
           arr[i] = sc.nextInt();   
        }
        bubbleSort(arr);
        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");    
        }
           
    }
    public static void bubbleSort(int arr3[]){
        int len = arr3.length;
        int temp=0;
        for(int j=0;j<len;j++){
        for(int k=1;k<len-j;k++){
         if(arr3[k-1]>arr3[k]){
             temp = arr3[k-1];
             arr3[k-1] = arr3[k];
             arr3[k] = temp;    
         }    
        }    
                
        
        
        
    }
    
}
}
