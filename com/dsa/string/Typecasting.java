package com.dsa.string;

public class Typecasting {
    public static void main(String[] args) {
    String series = ""; 
   for (int i = 0; i < 26; i++){
     char ch = (char)('a' + i);  
     System.out.print(ch +",");
      series += ch;
   } 
   System.out.println("\nstring of alphabet : " + series);//O(N^2) bad
}
}
