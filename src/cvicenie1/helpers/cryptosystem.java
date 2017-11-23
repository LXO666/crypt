/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

import java.lang.Math;
/**
 * 
 * 
 *
 * @author xhurtisl
 */

public class cryptosystem {
    
    
    
    
    
    public static Boolean guess(double[] count){
        Boolean vys=false;
    double[] ref = {0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228, 0.02015, 0.06094, 0.06966, 0.00153, 0.00772, 0.04025, 0.02406, 0.06749, 0.07507, 0.01929, 9.5E-4, 0.05987, 0.063269, 0.0905599, 0.02758, 0.00978, 0.0236, 0.0015, 0.01974, 7.4E-4};
        for (int i=0;i<=count.length-1;i++){
            
            System.out.println(count[i] +" --- " + ref[i]);
        
            if (Math.abs(ref[i]-count[i])>0.05){
                 vys=false;
                break;         
            }          
             vys=true;    
        }
        
        return vys;
    }
    
    
}
