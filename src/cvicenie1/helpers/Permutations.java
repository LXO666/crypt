/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

import java.util.Random;

/**
 *
 * @author xhurtisl
 */
public class Permutations {
    
   
    
    public static void rndPerm(int[] input){
    int size=input.length;
    Random rn = new Random();
    
    for (int i=0;i<=size-1;i++){
        int r=rn.nextInt(size-1);
        int s;
        s=input[i];
        input[i]=input[r];
        input[r]=s;
    }
    
     
        
        
      }
        
    }
    

