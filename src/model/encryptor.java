/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dinuthara
 */
public class encryptor {
    
    String string;
    ArrayList stringArr;
    ArrayList asciiArr;
    ArrayList ascii;
    String encrypted;
    int key;
    
    public encryptor(String string){
        this.string=string;
        stringArr = new ArrayList<>();
        asciiArr = new ArrayList<>();
        ascii = new ArrayList<>();
        encrypted="";
        key = keyGen();
    }
    
    public void encrypt(){
    System.out.println(string);
    
    for(int i = 0; i < this.string.length();i++){
        if(stringArr.indexOf(this.string.charAt(i))<0){
            stringArr.add(this.string.charAt(i));
            //System.out.print(this.string.charAt(i));
        }
    }
    //for(int i = 0 ; i < stringArr.size();i++){
    //    System.out.print(this.stringArr.get(i));
    //}
    
    for(int i = 32;i<127;i++){
    asciiArr.add((char)i);
    ascii.add((char)i);
    }
    System.out.print(asciiArr.size());
    
    for(int i = 0; i<key ; i++){
        for(int j=0;j<asciiArr.size()-1;j++){
            String temp1 = String.valueOf(asciiArr.get(j)) ;
            String temp2 = String.valueOf(asciiArr.get(j+1));
            asciiArr.set(j, temp2);
            asciiArr.set(j+1, temp1);
            
        }     
    }
    for(int i = 0; i < this.stringArr.size();i++){
        encrypted+=String.valueOf(asciiArr.get(ascii.indexOf(this.stringArr.get(i)))) ;    
    }
    
    System.out.println(encrypted);
    
    
    
    
    }
    
    
    public int keyGen(){
        Random rand = new Random();
        return rand.nextInt(9999);
    }
    
    public int getKey(){
    return key;
    }
    public String getEncrypted(){
    return encrypted;
    }
    
}
