/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearsearch;
// import java.util.Arrays;

/**
 *
 * @author Sampath Alampalli
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] input = {11,45,1,9,4,8,53,88,23};
        int key = 23;
        // System.out.println(input[5]);
        // Let us suppose the element we need to find is 53 and its position.
        int k;
        for(int i=0;i<input.length;i++){
            if(key == input[i]){
                System.out.println("we found the element at position "+i);
            }
            
           
        }
        
    }
}
