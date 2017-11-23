/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

import com.sun.xml.internal.ws.util.StringUtils;
import java.text.Normalizer;

/**
 *
 * @author xhurtisl
 */
public class Text {
    
    public static String convertToTSA(String in, boolean keepSpace){
        String text,text2,text3;
        
        text=in.toLowerCase();
        
        Normalizer.normalize(text, Normalizer.Form.NFD);
       text = text.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        String regEx = "[^a-z]";
        
        text = text.replaceAll(regEx, "");
       // text = text.replaceAll("[^\\p{ASCII}]", "");
        
       
        
        return text;
        
        
    
    }
    
    
}
