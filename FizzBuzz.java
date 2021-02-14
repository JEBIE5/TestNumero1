package com.company;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entrer un chiffre entre 1 a 100");
        try{
        int chiffre = myObj.nextInt();

            if (chiffre%3 == 0 && chiffre % 5== 0){
                System.out.println("FizzBuzz"); }

            else if (chiffre%3 == 0 ){ System.out.println("Fizz"); }

            else if ( chiffre % 5 == 0){ System.out.println("Buzz"); }

            else if (chiffre < 0 || chiffre > 200 ) { System.out.println("La " +
                    "valeur entre est invalide Bonne journee"); }
        }catch(Exception e) {
            System.out.println("La valeur entre est invalide Bonne journee");
        }
    }
}
