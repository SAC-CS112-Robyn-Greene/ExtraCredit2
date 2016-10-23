/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit2;

import java.util.*;

/**
 *
 * @author Robyn
 */
public class ExtraCredit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        short s= 2;
        byte one = 1;
        int num = 1;
        double d =1.5; 
        float f = 2.5f;
        char a = ' ';
        boolean Sassy;      
        String s1 =  "I have " + num + " cat at home. She name is "+ d + " years old.";
        String s2 ="In another "+ f + a + "she will be four." ;
        String s3 = s1 + s2;
        System.out.println(s3); 
        Sassy = d<=5;
        System.out.println( d<=5 ? "Sassy gets "+ one + " treat.": "Sassy gets " +s+ " a baths!");
    }//main

}//class
