/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizijava;
import java.util.Scanner;
/**
 *
 * @author 39392
 */
public class IndovinaZero_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.println("Inserisci il valore");
            n = input.nextInt();
        } while(n>0 && n<0);
    
    }
}
