/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dinuthara
 */
public class decryptor {
    ArrayList stringArr;
    String encrypted;
    ArrayList asciiArr;
    ArrayList ascii;
    int key1;
    String decrypted;
    public decryptor(String encrypted, int key){
        this.encrypted=encrypted;
        stringArr = new ArrayList<>();
        asciiArr = new ArrayList<>();
        ascii = new ArrayList<>();
        key1 = key;
        decrypted = "";
    }
    
public void decrypt(){
    
      for(int i = 0; i < this.encrypted.length();i++){
        if(stringArr.indexOf(this.encrypted.charAt(i))<0){
            stringArr.add(this.encrypted.charAt(i));
            //System.out.print(this.string.charAt(i));
        }
    }
    
     for(int i = 32;i<127;i++){
    asciiArr.add((char)i);
    ascii.add((char)i);
    }
     
       for(int i = 0; i<key1 ; i++){
        for(int j=0;j<asciiArr.size()-1;j++){
            String temp1 = String.valueOf(asciiArr.get(j)) ;
            String temp2 = String.valueOf(asciiArr.get(j+1));
            asciiArr.set(j, temp2);
            asciiArr.set(j+1, temp1);
            
        }     
    }
       
        for(int i = 0; i < this.stringArr.size();i++){
        decrypted+=String.valueOf(ascii.get(asciiArr.indexOf(this.stringArr.get(i)))) ;   
    }
        System.out.println(decrypted);
}

public String getDecrypted(){
return decrypted;
}
    
    
    
}
