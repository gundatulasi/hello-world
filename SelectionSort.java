/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsort;

import java.util.Scanner;

/**
 *
 * @author Sampath Alampalli
 */
public class SelectionSort {

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
        selectionSort(arr);
        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");    
        }
    }

    public static void selectionSort(int[] arr2) {
        int k,temp,min=0,temp2;
        for(int i=0;i<arr2.length-1;i++){
            min = i;
            for(int j=i+1;j<arr2.length;j++){
            if(arr2[min]>arr2[j]){
                min = j;
                }
            }
            if(min!=i){
              temp = arr2[i];
              arr2[i] = arr2[min];
              arr2[min] = temp;   
            }
        
        }
        //System.out.println(min);
            }
        }
        
        
       
    
    
    

