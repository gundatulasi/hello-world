/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearch;
public class BinarySearch {
 
   
    public static void main(String[] args) {
         
        int[] arr1 = {4,99,196,295,255};
        int index = binarySearch(arr1,0,arr1.length,1);
        System.out.println("Search element Found at "+index+" index");
        
    }
     public static int binarySearch(int[] sortedArray, int start, int end, int key) {
         
        if (start < end) {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) {
                return binarySearch(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return binarySearch(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;  
            }
        }
        return -(start + 1); 
    }
 
}
