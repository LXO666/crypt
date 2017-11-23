/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1;
import cvicenie1.helpers.Math;
import cvicenie1.helpers.Text;
import cvicenie1.helpers.TextStat;
import cvicenie1.helpers.cryptosystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import static javafx.scene.input.KeyCode.P;
import static javax.swing.text.html.HTML.Tag.P;

/**
 *
 * @author xhurtisl
 */
public class Main {

    
       
     
    public static void main(String[] args) {
        
       Set<Integer> P = new HashSet<Integer>();
         
        
        Random rnd = new Random(System.currentTimeMillis()); 
        
        Random rn = new Random();
        
        
        while(P.size()<10){
         P.add(rn.nextInt(26)+1);
        }
       
        
        for (int i : P) {
            System.out.print(i);
            System.out.print(' ');
        }
        
        List<Integer> Z = new ArrayList<Integer>(P);
        
        for (int i=0;i<=4;i++){
        Collections.shuffle(Z);
        }
        
        System.out.println();
        for(int i : Z){
            System.out.print(i);
            System.out.print(' ');
        }
        
        System.out.println();
        
        
        Integer[] pole = P.toArray(new Integer[P.size()]);
        
        
        String text="The earliest forms of secret writing required little more than writing implements since most people could not read. More literacy, or literate opponents, required actual cryptography. The main classical cipher types are transposition ciphers, which rearrange the order of letters in a message (e.g., 'hello world' becomes 'ehlol owrdl' in a trivially simple rearrangement scheme), and substitution ciphers, which systematically replace letters or groups of letters with other letters or groups of letters (e.g., 'fly at once' becomes 'gmz bu podf' by replacing each letter with the one following it in the Latin alphabet). Simple versions of either have never offered much confidentiality from enterprising opponents. An early substitution cipher was the Caesar cipher, in which each letter in the plaintext was replaced by a letter some fixed number of positions further down the alphabet. Suetonius reports that Julius Caesar used it with a shift of three to communicate with his generals. Atbash is an example of an early Hebrew cipher. The earliest known use of cryptography is some carved ciphertext on stone in Egypt (ca 1900 BCE), but this may have been done for the amusement of literate observers rather than as a way of concealing information.The Greeks of Classical times are said to have known of ciphers (e.g., the scytale transposition cipher claimed to have been used by the Spartan military).[16] Steganography (i.e., hiding even the existence of a message so as to keep it confidential) was also first developed in ancient times. An early example, from Herodotus, was a message tattooed on a slave's shaved head and concealed under the regrown hair.[10] More modern examples of steganography include the use of invisible ink, microdots, and digital watermarks to conceal information.";
        //String text="Ale ten double by to měl zmáknout, ne? Nehodí mi to žádnou chybu, jen to prostě začne číst vstup pořád dokola a nic se neděje. Kde je chyba? Na mojí straně, nebo na straně Javy?\nJinak mi to fakt počítá dobře, ale pro velká x to nic nedělá, dalo by se to nějak ošetřit?";
        System.out.print(text);
        System.out.println();
        
        String text2=Text.convertToTSA(text, true);
        
        //System.out.print(text2);
        
        
        double count [] = new double[26];
        int charcount=text2.length();
        
        Map<String,Double> mapa = TextStat.readNgram(text2, 1, true);
        int q=0;
                for (Map.Entry<String, Double> entrySet : mapa.entrySet()) {
                    
            String key = entrySet.getKey();
            Double value = entrySet.getValue();
            System.out.println(key + " - " + value);
           count[q]=(entrySet.getValue()/charcount);
           q++;
           
        }
                
                
                
                
          System.out.println();
          
          
       
          
          Boolean B=cryptosystem.guess(count);
          
          if (B==true){System.out.println("ANG");}
          else {System.out.println("NENI ANG");}
       
               
       
      //  int  f=Math.fakt(6);
        
       // System.out.println(f);
      
   
    }
    
}
