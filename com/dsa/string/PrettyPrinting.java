package com.dsa.string;

public class PrettyPrinting {
    public static void main(String[] args) {
        String a ="katoch";
        String b = "aryan";
        char c = 'a';
        float d = 212.47856f;
        
     // % work like a placeholder
     System.out.printf("formated number is %.2f" , d);
     System.out.printf("\n pie : %.3f",Math.PI);
     System.out.printf("\nHello my name is %s and i am %s",b,"cool");
     // %s -> lower case and %S -> uppercase automatically

    }
}
