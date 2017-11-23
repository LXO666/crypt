/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

/**
 *
 * @author xhurtisl
 */
public class Math {
    
    public static int fakt(int input){
   int result=1;
    
     for (int i=input;i>1;i--){
         result=result*i;
     }   
    
    
        return result;
        
    }
    
    public static boolean isPrime(int input){
     
        boolean pc=false;
        int del=0;
        
        for (int i=1;i<=input;i++){
           if (input % i == 0){del++;} 
        }
        
        if (del == 2){pc=true;}
        
        
        return pc;
        
        
    }
    
}
