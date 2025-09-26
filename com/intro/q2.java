package com.intro;

import java.util.*;

public class q2{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char x = sc.next().charAt(0);
    if (x=='a' ||x=='o'||x=='u'||x=='i'||x=='e'){
        System.out.println("vowel");
    }
    else{
        System.out.println("consonent");
    }
}
}