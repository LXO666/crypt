/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xhurtisl
 */
public class TextStat {
    
    
    public static Map<String,Double> readNgram(String txt,int n,boolean relativeFr) {
        
     Map<String,Double> mapa = new HashMap<>();
     
     int total = txt.length() - (n - 1);
        for (int i = 0; i < total; i++) {
            String k = txt.substring(i, i + n);
            mapa.put(k, (mapa.containsKey(k)) ? (mapa.get(k) + 1.0) : (1.0));
    
    
    }
    
        return mapa;
    
    }
}
