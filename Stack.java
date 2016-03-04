/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * @author S521650
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operation op = new Operation(5);
        op.push("Hello");
        op.push("Hi");
        System.out.println(op.peek());
        op.push("Sup");
        System.out.println(op.pop());        
    }
    
}
