package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int basamak;
     System.out.println("Basamak sayisi gir:");
     basamak=input.nextInt();
     
        for (int i = 1; i <= basamak ; i++) {
            
            for (int j = 1; j <= (basamak-i); j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2* i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = basamak - 1; i >= 1; i--) {
            
            for (int x = 1; x <= basamak - i ; x++) {
                System.out.print(" ");
            }
            
            for (int y = 1; y <= (2*i)-1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
