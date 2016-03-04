/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * @author Sampath Alampalli
 */
public class Operation {
    int maxSize;
    int top;
    String arr[];

    public Operation(int n) {
        maxSize = n;
        top = 0;
        arr = new String[maxSize];   
    }
    
    public boolean isEmpty(){
        if(top==0){
            return true;
            
        }
        return false;    
    }
    
    
    public void push(String str ){
        
       if(top<maxSize){
          arr[top] = str;
          top++;    
       } 
       else{
           System.out.println("Stack is full");
       }   
    }
    
    public String pop(){
        String temp = "";
        if(!this.isEmpty()){
            temp = this.peek();
            arr[top-1]=null;
            top--;
        }
        else{
            temp = null;    
        }
        return temp;
    }
    
    public String peek(){
        if(!this.isEmpty()){
        return arr[top-1];
    }else{
            return null;
        }
    
    
}
}
