package com.intro;
import java.util.Scanner;

public class vowelconso {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            char ch = in.next().charAt(0);
               
                 if( ch=='a'||ch=='A'|| ch=='e'|ch=='E'|| ch=='i'||ch=='I'|| ch=='o'||ch=='O'|| ch=='u'||ch=='U' ) {
                            System.out.println("Vowel");
                 }
                  else if (ch>'a'||ch>'A' && ch<='z'||ch<='Z') {
                    System.out.println("consonat");
                  }
                  else{
                    System.out.println("error");
                  }
               }
            }
        }
    

