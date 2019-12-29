package javamtpalindrommetoda;

import java.util.Scanner;

public class JavaMTPalindromMetoda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String red;
        String recenica;

        do {
            System.out.println("Unesite recenicu enter za kraj!!!");
            red = input.nextLine();
            recenica = preuredi(red);
            System.out.println("Ta recenica: ");
            if (recenica.equals(obrni(recenica))) 
                System.out.println("je:");
             else 
                System.out.println("Nije ");
            
            System.out.println("Palindrom");
        } while (red.length() != 0);

    }

    private static String preuredi(String red) {
        String preuredjenaNiska = "";
        red = red.toLowerCase();
        for (int i = 0; i < red.length(); i++) {
            char znak = red.charAt(i);
            if (Character.isLetter(znak)) 
               
                preuredjenaNiska += znak;
            
        }
        return preuredjenaNiska;
    }

    private static String obrni(String niska) {
        String obrnutaNiska = "";
        for (int i = niska.length() - 1;i>=0; i--) {
            obrnutaNiska += niska.charAt(i);
        }
        return obrnutaNiska;
    }

}
