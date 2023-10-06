//esercizio 2: consiste nel prendere 2 input di 2 interi da tasitera e fare la moltiplicazion
package eser1;

import java.util.Scanner;

public class Moltiplica {
    public static void main(String args[]){
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("iserire il primo numero:");
        int n1=keyboardScanner.nextInt();
        System.out.println("inserire il secondo numero: ");
        int n2=keyboardScanner.nextInt();
        System.out.println("ecco il risulatto "+ n1*n2);
        keyboardScanner.close();
    } 
}